package com.regula.facerecognition.webclient;

import com.regula.facerecognition.webclient.gen.model.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static final String API_BASE_PATH = "API_BASE_PATH";


    public static void main(String[] args) throws IOException {
        var apiBasePath = System.getenv(API_BASE_PATH);
        if (apiBasePath == null) {
            apiBasePath = "http://localhost:41101/api";
        }

        byte[] face1 = readFile("face_1.jpg");
        byte[] face2 = readFile("face_2.jpg");
        byte[] realVideo1 = readFile("real_video_1.mp4");
        byte[] realFrame1 = readFile("liveness_real_frame_1.jpg");
        byte[] realDepth1 = readFile("liveness_real_depth_1.png");
        byte[] realImage1 = readFile("liveness_real_image_1.png");

        var sdk = new Sdk(apiBasePath);

        var compareImage1 = new CompareImage().index(0).data(face1).type(ImageSource.LIVE);
        var compareImage2 = new CompareImage().index(1).data(face1).type(ImageSource.DOCUMENT_RFID);
        var compareImage3 = new CompareImage().index(3).data(face2).type(ImageSource.LIVE);
        var compareRequest = new CompareRequest().images(
                List.of(compareImage1, compareImage2, compareImage3)
        );
        var compareResponse = sdk.matchingApi.compare(compareRequest);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Compare Results                         ");
        System.out.println("-----------------------------------------------------------------");
        for (var i : compareResponse.getResults()) {
            System.out.format(
                    "pair(%d, %d) similarity: %f%n", i.getFirstIndex(), i.getSecondIndex(), i.getSimilarity()
            );
        }

        var detectRequest = new DetectRequest().image(face2);
        var detectResponse = sdk.matchingApi.detect(detectRequest);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Detect Results                          ");
        System.out.println("-----------------------------------------------------------------");
        System.out.format("detectorType: %d%n", detectResponse.getDetectorType());
        System.out.format("landmarkType: %d%n", detectResponse.getLandmarksType());
        for (var i : detectResponse.getDetections()) {
            System.out.format("landmarks: %s%n", i.getLandmarks());
            System.out.format("roi: %s%n", i.getRoi());
        }

        var videoLivenessResult = sdk.livenessApi.checkVideoLiveness(realVideo1);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                   Check video liveness result                   ");
        System.out.println("-----------------------------------------------------------------");
        System.out.format("livenessStatus: %s%n", videoLivenessResult.getLivenessStatus());

        var depthLivenessItem1 = new DepthLivenessItem().dataScene(realFrame1).dataDepth(realDepth1).depthScale(0.001f);
        var depthLiveness = new DepthLiveness().addImagesItem(depthLivenessItem1);
        var depthResult = sdk.livenessApi.checkDepthLiveness(depthLiveness);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                   Check depth liveness result                   ");
        System.out.println("-----------------------------------------------------------------");
        for (var i : depthResult) {
            System.out.format("index: %d%n", i.getIndex());
            System.out.format("code: %d%n", i.getCode());
            System.out.format("livenessStatus: %d%n", i.getLivenessStatus());
        }

        var imageLivenessItem1 = new ImageLivenessItem().data(realImage1);
        var imageLiveness = new ImageLiveness().addImagesItem(imageLivenessItem1);
        var imageLivenessResult = sdk.livenessApi.checkImageLiveness(imageLiveness);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                   Check image liveness result                   ");
        System.out.println("-----------------------------------------------------------------");
        for (var i : imageLivenessResult) {
            System.out.format("index: %d%n", i.getIndex());
            System.out.format("code: %d%n", i.getCode());
            System.out.format("livenessStatus: %d%n", i.getLivenessStatus());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    private static byte[] readFile(String filePath) throws IOException {
        var classLoader = Main.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath).readAllBytes();
    }
}
