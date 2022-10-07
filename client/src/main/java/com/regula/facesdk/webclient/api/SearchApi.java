package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.gen.model.SearchRequest;
import com.regula.facesdk.webclient.gen.model.SearchResult;

public class SearchApi extends com.regula.facesdk.webclient.gen.api.SearchApi {
    public SearchApi(ApiClient apiClient) {
        super(apiClient);
    }
    public SearchApi() {
        super();
    }

    public SearchResult search(SearchRequest searchRequest, String xRequestID) throws ApiException {
        return super.search(searchRequest, xRequestID);
    }

    public SearchResult search(SearchRequest searchRequest) throws ApiException {
        return super.search(searchRequest, "");
    }
}
