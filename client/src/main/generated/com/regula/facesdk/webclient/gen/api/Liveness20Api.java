/*
 * Regula Face SDK Web API
 * <a href=\"https://regulaforensics.com/products/face-recognition-sdk/  \" target=\"_blank\">Regula Face SDK</a> is a cross-platform biometric verification solution for a digital identity verification process and image quality assurance. The SDK enables convenient and reliable face capture on the client side (mobile, web, and desktop) and further processing on the client or server side.   The Face SDK includes the following features:  * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-detection\" target=\"_blank\">Face detection and image quality assessment</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-comparison-11\" target=\"_blank\">Face match (1:1)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#face-identification-1n\" target=\"_blank\">Face search (1:N)</a> * <a href=\"https://docs.regulaforensics.com/develop/face-sdk/overview/introduction/#liveness-assessment\" target=\"_blank\">Liveness detection</a>  Here is the <a href=\"https://github.com/regulaforensics/FaceSDK-web-openapi  \" target=\"_blank\">OpenAPI specification on GitHub</a>.   ### Clients * [JavaScript](https://github.com/regulaforensics/FaceSDK-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/FaceSDK-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/FaceSDK-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/FaceSDK-web-csharp-client) client for .NET & .NET Core 
 *
 * The version of the OpenAPI document: 6.1.0
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


import com.regula.facesdk.webclient.gen.model.TransactionInfo;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Liveness20Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public Liveness20Api() {
        this(Configuration.getDefaultApiClient());
    }

    public Liveness20Api(ApiClient apiClient) {
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
     * Build call for getLivenessTransactionInfo
     * @param transactionId ID of the current liveness transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get liveness transaction info </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLivenessTransactionInfoCall(UUID transactionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/liveness";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (transactionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transactionId", transactionId));
        }

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getLivenessTransactionInfoValidateBeforeCall(UUID transactionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getLivenessTransactionInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getLivenessTransactionInfoCall(transactionId, _callback);
        return localVarCall;

    }

    /**
     * liveness check
     * To verify the presence of a real person in front of a camera, use the GET &#x60;/api/v2/liveness&#x60; endpoint. When starting, you can specify &#x60;tag&#x60; which all attempts to read liveness will be bound to. If left unspecified, the application automatically generates one. The calling application returns &#x60;tag&#x60; and &#x60;transactionId&#x60;. One session may include many transactions, and from a transaction ID it is clear which session it belongs to.  When specifying &#x60;tag&#x60;, note that only Latin uppercase and lowercase letters, digits, and symbols &#x60;-&#x60; and &#x60;_&#x60; are allowed. The maximum supported number of characters is 127.  The metadata (device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc.), a person&#39;s selfie and video of the liveness detection session are stored on the backend at: &#x60;faceapi-session/year&#x3D;{year}/month&#x3D;{month}/day&#x3D;{day}/hour&#x3D;{hour}/minute&#x3D;{minute}/{tag}/transactionId&#x60;  By default, liveness checks operate with eventual consistency. This means that when you submit a request and receive a response, the associated data (like the selfie and session video) may be saved after the response is sent. If this doesn&#39;t meet your requirements, you can switch to strong consistency; refer to the [Architecture page](https://docs.regulaforensics.com/develop/face-sdk/overview/architecture/#consistency-models) for details.  To access the liveness transaction data, use GET &#x60;/api/v2/liveness?transactionId&#x3D;{transactionId}&#x60;. 
     * @param transactionId ID of the current liveness transaction. (required)
     * @return TransactionInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get liveness transaction info </td><td>  -  </td></tr>
     </table>
     */
    public TransactionInfo getLivenessTransactionInfo(UUID transactionId) throws ApiException {
        ApiResponse<TransactionInfo> localVarResp = getLivenessTransactionInfoWithHttpInfo(transactionId);
        return localVarResp.getData();
    }

    /**
     * liveness check
     * To verify the presence of a real person in front of a camera, use the GET &#x60;/api/v2/liveness&#x60; endpoint. When starting, you can specify &#x60;tag&#x60; which all attempts to read liveness will be bound to. If left unspecified, the application automatically generates one. The calling application returns &#x60;tag&#x60; and &#x60;transactionId&#x60;. One session may include many transactions, and from a transaction ID it is clear which session it belongs to.  When specifying &#x60;tag&#x60;, note that only Latin uppercase and lowercase letters, digits, and symbols &#x60;-&#x60; and &#x60;_&#x60; are allowed. The maximum supported number of characters is 127.  The metadata (device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc.), a person&#39;s selfie and video of the liveness detection session are stored on the backend at: &#x60;faceapi-session/year&#x3D;{year}/month&#x3D;{month}/day&#x3D;{day}/hour&#x3D;{hour}/minute&#x3D;{minute}/{tag}/transactionId&#x60;  By default, liveness checks operate with eventual consistency. This means that when you submit a request and receive a response, the associated data (like the selfie and session video) may be saved after the response is sent. If this doesn&#39;t meet your requirements, you can switch to strong consistency; refer to the [Architecture page](https://docs.regulaforensics.com/develop/face-sdk/overview/architecture/#consistency-models) for details.  To access the liveness transaction data, use GET &#x60;/api/v2/liveness?transactionId&#x3D;{transactionId}&#x60;. 
     * @param transactionId ID of the current liveness transaction. (required)
     * @return ApiResponse&lt;TransactionInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get liveness transaction info </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionInfo> getLivenessTransactionInfoWithHttpInfo(UUID transactionId) throws ApiException {
        okhttp3.Call localVarCall = getLivenessTransactionInfoValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<TransactionInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * liveness check (asynchronously)
     * To verify the presence of a real person in front of a camera, use the GET &#x60;/api/v2/liveness&#x60; endpoint. When starting, you can specify &#x60;tag&#x60; which all attempts to read liveness will be bound to. If left unspecified, the application automatically generates one. The calling application returns &#x60;tag&#x60; and &#x60;transactionId&#x60;. One session may include many transactions, and from a transaction ID it is clear which session it belongs to.  When specifying &#x60;tag&#x60;, note that only Latin uppercase and lowercase letters, digits, and symbols &#x60;-&#x60; and &#x60;_&#x60; are allowed. The maximum supported number of characters is 127.  The metadata (device model, screen data, frame size, app ID and version, OS version, platform, SDK version, etc.), a person&#39;s selfie and video of the liveness detection session are stored on the backend at: &#x60;faceapi-session/year&#x3D;{year}/month&#x3D;{month}/day&#x3D;{day}/hour&#x3D;{hour}/minute&#x3D;{minute}/{tag}/transactionId&#x60;  By default, liveness checks operate with eventual consistency. This means that when you submit a request and receive a response, the associated data (like the selfie and session video) may be saved after the response is sent. If this doesn&#39;t meet your requirements, you can switch to strong consistency; refer to the [Architecture page](https://docs.regulaforensics.com/develop/face-sdk/overview/architecture/#consistency-models) for details.  To access the liveness transaction data, use GET &#x60;/api/v2/liveness?transactionId&#x3D;{transactionId}&#x60;. 
     * @param transactionId ID of the current liveness transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get liveness transaction info </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLivenessTransactionInfoAsync(UUID transactionId, final ApiCallback<TransactionInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLivenessTransactionInfoValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<TransactionInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
