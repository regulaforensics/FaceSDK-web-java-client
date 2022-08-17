package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.api.MatchingApi;

public class FaceSdk {
    public final MatchingApi matchingApi;
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
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }
}
