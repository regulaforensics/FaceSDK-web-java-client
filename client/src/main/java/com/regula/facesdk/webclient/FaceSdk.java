package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.api.DiagnosticsApi;
import com.regula.facesdk.webclient.api.GroupApi;
import com.regula.facesdk.webclient.api.Liveness20Api;
import com.regula.facesdk.webclient.api.LivenessApi;
import com.regula.facesdk.webclient.api.MatchingApi;
import com.regula.facesdk.webclient.api.PersonApi;
import com.regula.facesdk.webclient.api.SearchApi;

public class FaceSdk {
    public final MatchingApi matchingApi;
    public final GroupApi groupApi;
    public final PersonApi personApi;
    public final SearchApi searchApi;
    public final LivenessApi livenessApi;
    public final Liveness20Api liveness20Api;
    public final DiagnosticsApi diagnosticsApi;
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
        this.livenessApi = new LivenessApi(apiClient);
        this.liveness20Api = new Liveness20Api(apiClient);
        this.diagnosticsApi = new DiagnosticsApi(apiClient);
    }

    public ApiClient getApiClient() {
        return this.apiClient;
    }
}
