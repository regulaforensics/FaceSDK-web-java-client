package com.regula.facesdk.webclient;

import com.regula.facesdk.webclient.api.GroupApi;
import com.regula.facesdk.webclient.api.HealthcheckApi;
import com.regula.facesdk.webclient.api.Liveness20Api;
import com.regula.facesdk.webclient.api.MatchApi;
import com.regula.facesdk.webclient.api.PersonApi;
import com.regula.facesdk.webclient.api.SearchApi;

public class FaceSdk {
  public final MatchApi matchApi;
  public final GroupApi groupApi;
  public final PersonApi personApi;
  public final SearchApi searchApi;
  public final Liveness20Api liveness20Api;
  public final HealthcheckApi healthcheckApi;
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
    this.matchApi = new MatchApi(apiClient);
    this.groupApi = new GroupApi(apiClient);
    this.personApi = new PersonApi(apiClient);
    this.searchApi = new SearchApi(apiClient);
    this.liveness20Api = new Liveness20Api(apiClient);
    this.healthcheckApi = new HealthcheckApi(apiClient);
  }

  public ApiClient getApiClient() {
    return this.apiClient;
  }
}
