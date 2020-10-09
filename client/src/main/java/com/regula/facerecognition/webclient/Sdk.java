package com.regula.facerecognition.webclient;

import com.regula.facerecognition.webclient.ext.api.LivenessApi;
import com.regula.facerecognition.webclient.gen.api.MatchingApi;

public class Sdk {
    private ApiClient apiClient;

    private MatchingApi matchingApi;
    private LivenessApi livenessApi;

    public Sdk() {
        this(Configuration.getDefaultApiClient());
    }

    public Sdk(String basePath) {
        this(basePath, false, false);
    }

    public Sdk(String basePath, boolean debugging) {
        this(basePath, debugging, false);
    }

    public Sdk(String basePath, boolean debugging, boolean verifyingSsl) {
        this(Configuration.getDefaultApiClient());

        this.apiClient.setBasePath(basePath);
        this.apiClient.setDebugging(debugging);
        this.apiClient.setVerifyingSsl(verifyingSsl);
    }

    public Sdk(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.matchingApi = new MatchingApi(apiClient);
        this.livenessApi = new LivenessApi(apiClient);
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }

    public MatchingApi getMatchingApi() {
        return this.matchingApi;
    }

    public LivenessApi getLivenessApi() {
        return this.livenessApi;
    }
}
