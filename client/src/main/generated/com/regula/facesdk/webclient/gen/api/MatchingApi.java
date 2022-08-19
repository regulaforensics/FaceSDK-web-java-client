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

import com.regula.facesdk.webclient.ApiCallback;
import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.ApiResponse;
import com.regula.facesdk.webclient.Configuration;
import com.regula.facesdk.webclient.Pair;
import com.regula.facesdk.webclient.ProgressRequestBody;
import com.regula.facesdk.webclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.regula.facesdk.webclient.gen.model.DetectRequest;
import com.regula.facesdk.webclient.gen.model.DetectResponse;
import com.regula.facesdk.webclient.gen.model.MatchRequest;
import com.regula.facesdk.webclient.gen.model.MatchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MatchingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MatchingApi(ApiClient apiClient) {
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
     * Build call for detect
     * @param detectRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return detection faces with their coordinates. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call detectCall(DetectRequest detectRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = detectRequest;

        // create path and map variables
        String localVarPath = "/api/detect";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call detectValidateBeforeCall(DetectRequest detectRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'detectRequest' is set
        if (detectRequest == null) {
            throw new ApiException("Missing the required parameter 'detectRequest' when calling detect(Async)");
        }
        

        okhttp3.Call localVarCall = detectCall(detectRequest, _callback);
        return localVarCall;

    }

    /**
     * Detect facial coordinates
     * 
     * @param detectRequest  (required)
     * @return DetectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return detection faces with their coordinates. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public DetectResponse detect(DetectRequest detectRequest) throws ApiException {
        ApiResponse<DetectResponse> localVarResp = detectWithHttpInfo(detectRequest);
        return localVarResp.getData();
    }

    /**
     * Detect facial coordinates
     * 
     * @param detectRequest  (required)
     * @return ApiResponse&lt;DetectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return detection faces with their coordinates. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DetectResponse> detectWithHttpInfo(DetectRequest detectRequest) throws ApiException {
        okhttp3.Call localVarCall = detectValidateBeforeCall(detectRequest, null);
        Type localVarReturnType = new TypeToken<DetectResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Detect facial coordinates (asynchronously)
     * 
     * @param detectRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return detection faces with their coordinates. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call detectAsync(DetectRequest detectRequest, final ApiCallback<DetectResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = detectValidateBeforeCall(detectRequest, _callback);
        Type localVarReturnType = new TypeToken<DetectResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for match
     * @param matchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return compare results with their score and similarity. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call matchCall(MatchRequest matchRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = matchRequest;

        // create path and map variables
        String localVarPath = "/api/match";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call matchValidateBeforeCall(MatchRequest matchRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'matchRequest' is set
        if (matchRequest == null) {
            throw new ApiException("Missing the required parameter 'matchRequest' when calling match(Async)");
        }
        

        okhttp3.Call localVarCall = matchCall(matchRequest, _callback);
        return localVarCall;

    }

    /**
     * Compare provided face images in all combinations and return similarity score for each pair.
     * 
     * @param matchRequest  (required)
     * @return MatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return compare results with their score and similarity. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public MatchResponse match(MatchRequest matchRequest) throws ApiException {
        ApiResponse<MatchResponse> localVarResp = matchWithHttpInfo(matchRequest);
        return localVarResp.getData();
    }

    /**
     * Compare provided face images in all combinations and return similarity score for each pair.
     * 
     * @param matchRequest  (required)
     * @return ApiResponse&lt;MatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return compare results with their score and similarity. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MatchResponse> matchWithHttpInfo(MatchRequest matchRequest) throws ApiException {
        okhttp3.Call localVarCall = matchValidateBeforeCall(matchRequest, null);
        Type localVarReturnType = new TypeToken<MatchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Compare provided face images in all combinations and return similarity score for each pair. (asynchronously)
     * 
     * @param matchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation; return compare results with their score and similarity. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call matchAsync(MatchRequest matchRequest, final ApiCallback<MatchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = matchValidateBeforeCall(matchRequest, _callback);
        Type localVarReturnType = new TypeToken<MatchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
