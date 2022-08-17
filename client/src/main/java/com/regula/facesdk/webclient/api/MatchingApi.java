package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.MatchRequest;
import com.regula.facesdk.webclient.gen.model.MatchResponse;

public class MatchingApi extends com.regula.facesdk.webclient.gen.api.MatchingApi {
    public MatchingApi() {
        super();
    }

    public MatchingApi(ApiClient apiClient) {
        super(apiClient);
    }

    public MatchResponse match(MatchRequest matchRequest) throws ApiException {
        return super.match(matchRequest);
    }
}
