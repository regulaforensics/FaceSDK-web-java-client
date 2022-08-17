/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API
 *
 * The version of the OpenAPI document: 3.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.regula.facesdk.webclient.gen.api;

import com.google.gson.reflect.TypeToken;
import com.regula.facesdk.webclient.*;
import com.regula.facesdk.webclient.gen.model.SearchRequest;
import com.regula.facesdk.webclient.gen.model.SearchResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for search
     *
     * @param searchRequest Search argument (required)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successful operation; return search result </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchCall(SearchRequest searchRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[]{};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchRequest;

        // create path and map variables
        String localVarPath = "/api/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[]{};
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchValidateBeforeCall(SearchRequest searchRequest, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'searchRequest' is set
        if (searchRequest == null) {
            throw new ApiException("Missing the required parameter 'searchRequest' when calling search(Async)");
        }


        okhttp3.Call localVarCall = searchCall(searchRequest, _callback);
        return localVarCall;

    }

    /**
     * Find person by image in groups scope
     *
     * @param searchRequest Search argument (required)
     * @return SearchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successful operation; return search result </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
     * </table>
     */
    public SearchResult search(SearchRequest searchRequest) throws ApiException {
        ApiResponse<SearchResult> localVarResp = searchWithHttpInfo(searchRequest);
        return localVarResp.getData();
    }

    /**
     * Find person by image in groups scope
     *
     * @param searchRequest Search argument (required)
     * @return ApiResponse&lt;SearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successful operation; return search result </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<SearchResult> searchWithHttpInfo(SearchRequest searchRequest) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchRequest, null);
        Type localVarReturnType = new TypeToken<SearchResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find person by image in groups scope (asynchronously)
     *
     * @param searchRequest Search argument (required)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Successful operation; return search result </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call searchAsync(SearchRequest searchRequest, final ApiCallback<SearchResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchValidateBeforeCall(searchRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}