package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.gen.model.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static final String API_BASE_PATH = "API_BASE_PATH";


    public static void main(String[] args) throws IOException {
        var apiBasePath = System.getenv(API_BASE_PATH);
        if (apiBasePath == null) {
            apiBasePath = "http://localhost:41101";
        }
        byte[] face1 = readFile("face_1.jpg");
        byte[] face2 = readFile("face_2.jpg");

        var sdk = new FaceSdk(apiBasePath);

        var matchImage1 = new MatchImage().index(0).data(face1).type(ImageSource.LIVE);
        var matchImage2 = new MatchImage().index(1).data(face1).type(ImageSource.DOCUMENT_RFID);
        var matchImage3 = new MatchImage().index(3).data(face2).type(ImageSource.LIVE);
        var matchRequest = new MatchRequest().images(
                List.of(matchImage1, matchImage2, matchImage3)
        );
        var matchResponse = sdk.matchingApi.match(matchRequest);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Matching Results                         ");
        System.out.println("-----------------------------------------------------------------");
        for (var comparison : matchResponse.getResults()) {
            System.out.format(
                    "pair(%d, %d) similarity: %f%n",
                    comparison.getFirstIndex(), comparison.getSecondIndex(), comparison.getSimilarity()
            );
        }

        var detectRequest = new DetectRequest().image(face2);
        var detectResponse = sdk.matchingApi.detect(detectRequest);
        var detectResults = detectResponse.getResults();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Detect Results                          ");
        System.out.println("-----------------------------------------------------------------");
        System.out.format("detectorType: %d%n", detectResults.getDetectorType());
        System.out.format("landmarkType: %d%n", detectResults.getLandmarksType());
        for (var detection : detectResults.getDetections()) {
            System.out.format("landmarks: %s%n", detection.getLandmarks());
            System.out.format("roi: %s%n", detection.getRoi());
            System.out.format("attributes: %s%n", detection.getAttributes());
        }
        System.out.println("-----------------------------------------------------------------");
        System.exit(0);
    }

    private static byte[] readFile(String filePath) throws IOException {
        var classLoader = Main.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath).readAllBytes();
    }
}
