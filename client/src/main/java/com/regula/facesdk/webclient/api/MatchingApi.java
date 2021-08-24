package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.CompareResponse;
import com.regula.facesdk.webclient.gen.model.MatchRequest;

public class MatchingApi extends com.regula.facesdk.webclient.gen.api.MatchingApi {
  public MatchingApi() {
    super();
  }

  public MatchingApi(ApiClient apiClient) {
    super(apiClient);
  }

  public CompareResponse compare(MatchRequest matchRequest) throws ApiException {
    return new CompareResponse(super.match(matchRequest));
  }
}
