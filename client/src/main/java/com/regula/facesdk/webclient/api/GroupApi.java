package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.*;

import java.util.UUID;

public class GroupApi extends com.regula.facesdk.webclient.gen.api.GroupApi {
    public GroupApi(ApiClient apiClient) {
        super(apiClient);
    }
    public GroupApi() {
        super();
    }

    public Group createGroup(GroupToCreate groupToCreate, String xRequestID) throws ApiException {
        return super.createGroup(groupToCreate, xRequestID);
    }
    public Group createGroup(GroupToCreate groupToCreate) throws ApiException {
        return this.createGroup(groupToCreate, "");
    }

    public void deleteGroup(UUID groupId, String xRequestID) throws ApiException {
        super.deleteGroup(groupId, xRequestID);
    }
    public void deleteGroup(UUID groupId) throws ApiException {
        super.deleteGroup(groupId, "");
    }

    public GroupPage getAllGroups(Integer page, Integer size, String xRequestID) throws ApiException {
        return super.getAllGroups(page, size, xRequestID);
    }
    public GroupPage getAllGroups(Integer page, Integer size) throws ApiException {
        return this.getAllGroups(page, size, "");
    }

    public PersonsPage getAllPersonsByGroupId(Integer page, Integer size, UUID groupId, String xRequestID) throws ApiException {
        return super.getAllPersonsByGroupId(page, size, groupId, xRequestID);
    }
    public PersonsPage getAllPersonsByGroupId(Integer page, Integer size, UUID groupId) throws ApiException {
        return super.getAllPersonsByGroupId(page, size, groupId, "");
    }

    public Group getGroup(UUID groupId, String xRequestID) throws ApiException {
        return super.getGroup(groupId, xRequestID);
    }
    public Group getGroup(UUID groupId) throws ApiException {
        return super.getGroup(groupId, "");
    }

    public void updateGroup(UUID groupId, GroupToCreate groupToCreate, String xRequestID) throws ApiException {
        super.updateGroup(groupId, groupToCreate, xRequestID);
    }
    public void updateGroup(Integer groupId, GroupToCreate groupToCreate) throws ApiException {
        this.updateGroup(groupId, groupToCreate);
    }

    public void updatePersonsInGroup(UUID groupId, UpdateGroup updateGroup, String xRequestID) throws ApiException {
        super.updatePersonsInGroup(groupId, updateGroup, xRequestID);
    }
    public void updatePersonsInGroup(UUID groupId, UpdateGroup updateGroup) throws ApiException {
        super.updatePersonsInGroup(groupId, updateGroup, "");
    }

}
