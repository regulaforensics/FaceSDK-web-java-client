package com.regula.facesdk.webclient.api;

import com.regula.facesdk.webclient.ApiCallback;
import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.ApiResponse;
import com.regula.facesdk.webclient.Configuration;
import java.io.File;
import java.util.Map;

public class LivenessApi extends com.regula.facesdk.webclient.gen.api.LivenessApi {
    public LivenessApi() {
        super(Configuration.getDefaultApiClient());
    }

    public LivenessApi(ApiClient apiClient) {
        super(apiClient);
    }

    public ApiClient getApiClient() {
        return super.getApiClient();
    }

    public void setApiClient(ApiClient apiClient) {
        super.setApiClient(apiClient);
    }

    public int getHostIndex() {
        return super.getHostIndex();
    }

    public void setHostIndex(int hostIndex) {
        super.setHostIndex(hostIndex);
    }

    public String getCustomBaseUrl() {
        return super.getCustomBaseUrl();
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        super.setCustomBaseUrl(customBaseUrl);
    }

    public okhttp3.Call livenessMetadataCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        return super.livenessMetadataCall(ERROR_UNKNOWN, _callback);
    }

    public Map<String, Object> livenessMetadata(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessMetadata(ERROR_UNKNOWN);
    }

    public ApiResponse<Map<String, Object>> livenessMetadataWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessMetadataWithHttpInfo(ERROR_UNKNOWN);
    }

    public okhttp3.Call livenessMetadataAsync(Integer ERROR_UNKNOWN, final ApiCallback<Map<String, Object>> _callback) throws ApiException {
        return super.livenessMetadataAsync(ERROR_UNKNOWN, _callback);
    }

    public okhttp3.Call livenessPortraitCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        return super.livenessPortraitCall(ERROR_UNKNOWN, _callback);
    }

    public File livenessPortrait(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessPortrait(ERROR_UNKNOWN);
    }
    
    public ApiResponse<File> livenessPortraitWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessPortraitWithHttpInfo(ERROR_UNKNOWN);
    }

    public okhttp3.Call livenessPortraitAsync(Integer ERROR_UNKNOWN, final ApiCallback<File> _callback) throws ApiException {
        return super.livenessPortraitAsync(ERROR_UNKNOWN, _callback);
    }
    
    public okhttp3.Call livenessVideoCall(Integer ERROR_UNKNOWN, final ApiCallback _callback) throws ApiException {
        return super.livenessVideoCall(ERROR_UNKNOWN, _callback);
    }

    public File livenessVideo(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessVideo(ERROR_UNKNOWN);
    }

    public ApiResponse<File> livenessVideoWithHttpInfo(Integer ERROR_UNKNOWN) throws ApiException {
        return super.livenessVideoWithHttpInfo(ERROR_UNKNOWN);
    }

    public okhttp3.Call livenessVideoAsync(Integer ERROR_UNKNOWN, final ApiCallback<File> _callback) throws ApiException {
        return super.livenessVideoAsync(ERROR_UNKNOWN, _callback);
    }
}
