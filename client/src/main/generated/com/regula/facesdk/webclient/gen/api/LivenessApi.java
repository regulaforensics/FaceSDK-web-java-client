/*
 * Regula FaceSDK Web API
 * Regula FaceSDK Web API # Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 4.1.3
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


import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivenessApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LivenessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LivenessApi(ApiClient apiClient) {
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
     * Build call for livenessMetadata
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, metadata returned: device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no metadata available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessMetadataCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/liveness/metadata";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ERROR_UNKNOWN != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("", ERROR_UNKNOWN));
        }

        final String[] localVarAccepts = {
            "application/json", "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call livenessMetadataValidateBeforeCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ERROR_UNKNOWN' is set
        if (ERROR_UNKNOWN == null) {
            throw new ApiException("Missing the required parameter 'ERROR_UNKNOWN' when calling livenessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = livenessMetadataCall(ERROR_UNKNOWN, _callback);
        return localVarCall;

    }

    /**
     * Liveness 2.0 metadata
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, metadata returned: device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no metadata available </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, Object> livenessMetadata(Integer ERROR_UNKNOWN) throws ApiException {
        ApiResponse<Map<String, Object>> localVarResp = livenessMetadataWithHttpInfo(ERROR_UNKNOWN);
        return localVarResp.getData();
    }

    /**
     * Liveness 2.0 metadata
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, metadata returned: device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no metadata available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, Object>> livenessMetadataWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        okhttp3.Call localVarCall = livenessMetadataValidateBeforeCall(ERROR_UNKNOWN, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liveness 2.0 metadata (asynchronously)
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, metadata returned: device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no metadata available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessMetadataAsync(Integer ERROR_UNKNOWN, final ApiCallback<Map<String, Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = livenessMetadataValidateBeforeCall(ERROR_UNKNOWN, _callback);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for livenessPortrait
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, portrait returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no portrait available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessPortraitCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/liveness/portrait";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ERROR_UNKNOWN != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("", ERROR_UNKNOWN));
        }

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call livenessPortraitValidateBeforeCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ERROR_UNKNOWN' is set
        if (ERROR_UNKNOWN == null) {
            throw new ApiException("Missing the required parameter 'ERROR_UNKNOWN' when calling livenessPortrait(Async)");
        }
        

        okhttp3.Call localVarCall = livenessPortraitCall(ERROR_UNKNOWN, _callback);
        return localVarCall;

    }

    /**
     * Liveness 2.0 portrait
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, portrait returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no portrait available </td><td>  -  </td></tr>
     </table>
     */
    public File livenessPortrait(Integer ERROR_UNKNOWN) throws ApiException {
        ApiResponse<File> localVarResp = livenessPortraitWithHttpInfo(ERROR_UNKNOWN);
        return localVarResp.getData();
    }

    /**
     * Liveness 2.0 portrait
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, portrait returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no portrait available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> livenessPortraitWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        okhttp3.Call localVarCall = livenessPortraitValidateBeforeCall(ERROR_UNKNOWN, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liveness 2.0 portrait (asynchronously)
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, portrait returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no portrait available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessPortraitAsync(Integer ERROR_UNKNOWN, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = livenessPortraitValidateBeforeCall(ERROR_UNKNOWN, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for livenessVideo
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, session video returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no session video available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessVideoCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/liveness/video";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ERROR_UNKNOWN != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("", ERROR_UNKNOWN));
        }

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call livenessVideoValidateBeforeCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ERROR_UNKNOWN' is set
        if (ERROR_UNKNOWN == null) {
            throw new ApiException("Missing the required parameter 'ERROR_UNKNOWN' when calling livenessVideo(Async)");
        }
        

        okhttp3.Call localVarCall = livenessVideoCall(ERROR_UNKNOWN, _callback);
        return localVarCall;

    }

    /**
     * Liveness 2.0 video
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, session video returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no session video available </td><td>  -  </td></tr>
     </table>
     */
    public File livenessVideo(Integer ERROR_UNKNOWN) throws ApiException {
        ApiResponse<File> localVarResp = livenessVideoWithHttpInfo(ERROR_UNKNOWN);
        return localVarResp.getData();
    }

    /**
     * Liveness 2.0 video
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, session video returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no session video available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> livenessVideoWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        okhttp3.Call localVarCall = livenessVideoValidateBeforeCall(ERROR_UNKNOWN, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liveness 2.0 video (asynchronously)
     * 
     * @param ERROR_UNKNOWN ID of the current liveness transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation, session video returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, no session video available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call livenessVideoAsync(Integer ERROR_UNKNOWN, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = livenessVideoValidateBeforeCall(ERROR_UNKNOWN, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
