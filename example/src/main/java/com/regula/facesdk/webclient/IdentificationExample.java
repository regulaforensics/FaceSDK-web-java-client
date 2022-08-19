package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.gen.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class IdentificationExample {
    public static final String API_BASE_PATH = "API_BASE_PATH";


    public static void main(String[] args) throws IOException {
        var apiBasePath = System.getenv(API_BASE_PATH);
        if (apiBasePath == null) {
            apiBasePath = "http://127.0.0.0:41101";
        }
        byte[] face1 = readFile("face_1.jpg");
        byte[] face2 = readFile("face_2.jpg");

        var sdk = new FaceSdk(apiBasePath);

        Integer person1Id = sdk.personApi.createPerson(
                new PersonFields().name("person1").metadata(new HashMap<String, Object>())
        ).getId();
        Integer person2Id = sdk.personApi.createPerson(
                new PersonFields().name("person2").metadata(new HashMap<String, Object>())
        ).getId();

        sdk.personApi.addImageToPerson(person1Id, new ImageFields().image(new ImageFieldsImage().content(face1)));
        sdk.personApi.addImageToPerson(person2Id, new ImageFields().image(new ImageFieldsImage().content(face2)));

        Person person1 = sdk.personApi.getPerson(person1Id);
        Person person2 = sdk.personApi.getPerson(person2Id);

        var group = sdk.groupApi.createGroup(
                new GroupToCreate().name("group1").metadata(new HashMap<String, Object>())
        );

        sdk.groupApi.updatePersonsInGroup(
                group.getId(), new UpdateGroup().addItems(Arrays.asList(person1.getId(), person2.getId()))
        );

        var searchResult = sdk.searchApi.search(
                new SearchRequest()
                        .groupIds(Arrays.asList(group.getId()))
                        .image(new ImageFieldsImage().content(face1)));

        System.out.println(String.format("Person #1 %s %s%n", person1.getId(), person1.getName()));
        System.out.println(String.format("Person #2 %s %s%n", person2.getId(), person2.getName()));
        System.out.println(String.format("Group %s %s%n", group.getId(), group.getName()));
        System.out.println(searchResult.toString());


    }

    private static byte[] readFile(String filePath) throws IOException {
        var classLoader = Main.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath).readAllBytes();
    }
}
