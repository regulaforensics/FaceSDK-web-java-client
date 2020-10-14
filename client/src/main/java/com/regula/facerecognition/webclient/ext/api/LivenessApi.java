package com.regula.facerecognition.webclient.ext.api;

import com.google.gson.reflect.TypeToken;
import com.regula.facerecognition.webclient.*;
import com.regula.facerecognition.webclient.gen.model.LivenessResultItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivenessApi extends com.regula.facerecognition.webclient.gen.api.LivenessApi {

    public LivenessApi() {
        super();
    }

    public LivenessApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Detect face from the video and check its liveness status.
     *
     * @param body  (required)
     * @return LivenessResultItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> Successful operation; return detected face with its liveness status. </td><td>  -  </td></tr>
    <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
    <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
    </table>
     */
    public LivenessResultItem checkVideoLiveness(byte[] body) throws ApiException {
        ApiResponse<LivenessResultItem> localVarsResp = checkVideoLivenessWithHttpInfo(body);
        return localVarsResp.getData();
    }

    /**
     * Detect face from the video and check its liveness status.
     *
     * @param body  (required)
     * @return ApiResponse&lt;LivenessResultItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> Successful operation; return detected face with its liveness status. </td><td>  -  </td></tr>
    <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
    <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
    </table>
     */
    public ApiResponse<LivenessResultItem> checkVideoLivenessWithHttpInfo(byte[] body) throws ApiException {
        okhttp3.Call localVarCall = checkVideoLivenessValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<LivenessResultItem>(){}.getType();
        return this.getApiClient().execute(localVarCall, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkVideoLivenessValidateBeforeCall(byte[] body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkVideoLiveness(Async)");
        }

        okhttp3.Call localVarCall = checkVideoLivenessCall(body, _callback);
        return localVarCall;
    }

    /**
     * Build call for checkVideoLiveness
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> Successful operation; return detected face with its liveness status. </td><td>  -  </td></tr>
    <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
    <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call checkVideoLivenessCall(byte[] body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/liveness";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = this.getApiClient().selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/octet-stream"
        };
        final String localVarContentType = this.getApiClient().selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return this.getApiClient().buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    /**
     * Detect face from the video and check its liveness status. (asynchronously)
     *
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> Successful operation; return detected face with its liveness status. </td><td>  -  </td></tr>
    <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
    <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call checkVideoLivenessAsync(byte[] body, final ApiCallback<LivenessResultItem> _callback) throws ApiException {
        okhttp3.Call localVarCall = checkVideoLivenessValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<LivenessResultItem>(){}.getType();
        this.getApiClient().executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
