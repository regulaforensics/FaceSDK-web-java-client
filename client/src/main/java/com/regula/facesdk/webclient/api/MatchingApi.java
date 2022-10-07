package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.ApiResponse;
import com.regula.facesdk.webclient.gen.model.DetectRequest;
import com.regula.facesdk.webclient.gen.model.DetectResponse;
import com.regula.facesdk.webclient.gen.model.MatchRequest;
import com.regula.facesdk.webclient.gen.model.MatchResponse;

import java.util.Optional;

public class MatchingApi extends com.regula.facesdk.webclient.gen.api.MatchingApi {
    public MatchingApi() {
        super();
    }

    public MatchingApi(ApiClient apiClient) {
        super(apiClient);
    }

    public MatchResponse match(MatchRequest matchRequest, String xRequestID) throws ApiException {
        return super.match(matchRequest, xRequestID);
    }

    public MatchResponse match(MatchRequest matchRequest) throws ApiException {
        return super.match(matchRequest, "");
    }

    public DetectResponse detect(DetectRequest detectRequest, String xRequestID) throws ApiException {
        ApiResponse<DetectResponse> localVarResp = detectWithHttpInfo(detectRequest, xRequestID);
        return localVarResp.getData();
    }

    public DetectResponse detect(DetectRequest detectRequest) throws ApiException {
        ApiResponse<DetectResponse> localVarResp = detectWithHttpInfo(detectRequest, "");
        return localVarResp.getData();
    }
}
