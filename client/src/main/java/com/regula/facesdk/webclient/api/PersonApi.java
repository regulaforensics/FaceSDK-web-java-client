package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.*;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

public class PersonApi extends com.regula.facesdk.webclient.gen.api.PersonApi {
    public PersonApi(ApiClient apiClient) {
        super(apiClient);
    }
    public PersonApi() {
        super();
    }

    public Person createPerson(PersonFields personFields, String xRequestID) throws ApiException {
        if (personFields.getMetadata() == null) personFields.setMetadata(new HashMap<String, Object>());
        return super.createPerson(personFields, xRequestID);
    }

    public Person createPerson(PersonFields personFields) throws ApiException {
        if (personFields.getMetadata() == null) personFields.setMetadata(new HashMap<String, Object>());
        return this.createPerson(personFields, "");
    }

    public Image addImageToPerson(UUID personId, ImageFields imageFields, String xRequestID) throws ApiException {
        return super.addImageToPerson(personId, imageFields, xRequestID);
    }
    public Image addImageToPerson(UUID personId, ImageFields imageFields) throws ApiException {
        return addImageToPerson(personId, imageFields, "");
    }

    public void deleteImageOfPerson(String imageId, UUID personId, String xRequestID) throws ApiException {
        super.deleteImageOfPerson(imageId, personId, xRequestID);
    }

    public void deleteImageOfPerson(String imageId, UUID personId) throws ApiException {
        this.deleteImageOfPerson(imageId, personId, "");
    }

    public void deletePerson(UUID personId, String xRequestID) throws ApiException {
        super.deletePerson(personId, xRequestID);
    }
    public void deletePerson(UUID personId) throws ApiException {
        this.deletePerson(personId, "");
    }

    public GroupPage getAllGroupsByPersonId(Integer page, Integer size, UUID personId, String xRequestID) throws ApiException {
        return super.getAllGroupsByPersonId(page,size, personId, xRequestID);
    }
    public GroupPage getAllGroupsByPersonId(Integer page, Integer size, UUID personId) throws ApiException {
        return this.getAllGroupsByPersonId(page,size, personId, "");
    }

    public ImagePage getAllImagesByPersonId(Integer page, Integer size, UUID personId, String xRequestID) throws ApiException {
        return super.getAllImagesByPersonId(page, size, personId, xRequestID);
    }
    public ImagePage getAllImagesByPersonId(Integer page, Integer size, UUID personId) throws ApiException {
        return this.getAllImagesByPersonId(page, size, personId, "");
    }

    public File getImageOfPerson(String imageId, UUID personId, String xRequestID) throws ApiException {
        return super.getImageOfPerson(imageId, personId, xRequestID);
    }
    public File getImageOfPerson(String imageId, UUID personId) throws ApiException {
        return this.getImageOfPerson(imageId, personId, "");
    }

    public Person getPerson(UUID personId, String xRequestID) throws ApiException {
        return super.getPerson(personId, xRequestID);
    }
    public Person getPerson(UUID personId) throws ApiException {
        return this.getPerson(personId, "");
    }

    public void updatePerson(UUID personId, PersonFields personFields, String xRequestID) throws ApiException {
        if (personFields.getMetadata() == null) personFields.setMetadata(new HashMap<String, Object>());
        super.updatePerson(personId, personFields, xRequestID);
    }
    public void updatePerson(UUID personId, PersonFields personFields) throws ApiException {
        if (personFields.getMetadata() == null) personFields.setMetadata(new HashMap<String, Object>());
        super.updatePerson(personId, personFields, "");
    }
}
