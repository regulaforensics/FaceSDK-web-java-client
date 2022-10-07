package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.*;

import java.io.File;

public class PersonApi extends com.regula.facesdk.webclient.gen.api.PersonApi {
    public PersonApi(ApiClient apiClient) {
        super(apiClient);
    }
    public PersonApi() {
        super();
    }

    public Person createPerson(PersonFields personFields, String xRequestID) throws ApiException {
        return super.createPerson(personFields, xRequestID);
    }

    public Person createPerson(PersonFields personFields) throws ApiException {
        return this.createPerson(personFields, "");
    }

    public Image addImageToPerson(Integer personId, ImageFields imageFields, String xRequestID) throws ApiException {
        return super.addImageToPerson(personId, imageFields, xRequestID);
    }
    public Image addImageToPerson(Integer personId, ImageFields imageFields) throws ApiException {
        return addImageToPerson(personId, imageFields, "");
    }

    public void deleteImageOfPerson(Integer imageId, Integer personId, String xRequestID) throws ApiException {
        super.deleteImageOfPerson(imageId, personId, xRequestID);
    }

    public void deleteImageOfPerson(Integer imageId, Integer personId) throws ApiException {
        this.deleteImageOfPerson(imageId, personId, "");
    }

    public void deletePerson(Integer personId, String xRequestID) throws ApiException {
        super.deletePerson(personId, xRequestID);
    }
    public void deletePerson(Integer personId) throws ApiException {
        this.deletePerson(personId, "");
    }

    public GroupPage getAllGroupsByPersonId(Integer page, Integer size, Integer personId, String xRequestID) throws ApiException {
        return super.getAllGroupsByPersonId(page,size, personId, xRequestID);
    }
    public GroupPage getAllGroupsByPersonId(Integer page, Integer size, Integer personId) throws ApiException {
        return this.getAllGroupsByPersonId(page,size, personId, "");
    }

    public ImagePage getAllImagesByPersonId(Integer page, Integer size, Integer personId, String xRequestID) throws ApiException {
        return super.getAllImagesByPersonId(page, size, personId, xRequestID);
    }
    public ImagePage getAllImagesByPersonId(Integer page, Integer size, Integer personId) throws ApiException {
        return this.getAllImagesByPersonId(page, size, personId, "");
    }

    public PersonsPage getAllPersons(Integer page, Integer size, String xRequestID) throws ApiException {
        return super.getAllPersons(page, size, xRequestID);
    }
    public PersonsPage getAllPersons(Integer page, Integer size) throws ApiException {
        return this.getAllPersons(page, size, "");
    }

    public File getImageOfPerson(Integer imageId, Integer personId, String xRequestID) throws ApiException {
        return super.getImageOfPerson(imageId, personId, xRequestID);
    }
    public File getImageOfPerson(Integer imageId, Integer personId) throws ApiException {
        return this.getImageOfPerson(imageId, personId, "");
    }

    public Person getPerson(Integer personId, String xRequestID) throws ApiException {
        return super.getPerson(personId, xRequestID);
    }
    public Person getPerson(Integer personId) throws ApiException {
        return this.getPerson(personId, "");
    }

    public void updatePerson(Integer personId, PersonFields personFields, String xRequestID) throws ApiException {
        super.updatePerson(personId, personFields, xRequestID);
    }
    public void updatePerson(Integer personId, PersonFields personFields) throws ApiException {
        super.updatePerson(personId, personFields, "");
    }
}
