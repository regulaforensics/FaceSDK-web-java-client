package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.api.MatchingApi;
import com.regula.facesdk.webclient.gen.api.GroupApi;
import com.regula.facesdk.webclient.gen.api.PersonApi;
import com.regula.facesdk.webclient.gen.api.SearchApi;

public class FaceSdk {
    public final MatchingApi matchingApi;
    public final GroupApi groupApi;
    public final PersonApi personApi;
    public final SearchApi searchApi;
    private ApiClient apiClient;

    public FaceSdk() {
        this(Configuration.getDefaultApiClient());
    }

    public FaceSdk(String basePath) {
        this(basePath, false, false);
    }

    public FaceSdk(String basePath, boolean debugging) {
        this(basePath, debugging, false);
    }

    public FaceSdk(String basePath, boolean debugging, boolean verifyingSsl) {
        this(Configuration.getDefaultApiClient());

        this.apiClient.setBasePath(basePath);
        this.apiClient.setDebugging(debugging);
        this.apiClient.setVerifyingSsl(verifyingSsl);
    }

    public FaceSdk(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.matchingApi = new MatchingApi(apiClient);
        this.groupApi = new GroupApi(apiClient);
        this.personApi = new PersonApi(apiClient);
        this.searchApi = new SearchApi(apiClient);
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }
}
