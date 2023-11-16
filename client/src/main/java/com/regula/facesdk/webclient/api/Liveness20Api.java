package com.regula.facesdk.webclient.api;

import com.google.gson.reflect.TypeToken;
import com.regula.facesdk.webclient.ApiCallback;
import com.regula.facesdk.webclient.ApiClient;
import com.regula.facesdk.webclient.ApiException;
import com.regula.facesdk.webclient.ApiResponse;
import com.regula.facesdk.webclient.Configuration;
import com.regula.facesdk.webclient.Pair;
import com.regula.facesdk.webclient.gen.model.TransactionInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Liveness20Api extends com.regula.facesdk.webclient.gen.api.Liveness20Api {
    public Liveness20Api() {
        super(Configuration.getDefaultApiClient());
    }

    public Liveness20Api(ApiClient apiClient) {
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

    public okhttp3.Call getLivenessTransactionInfoCall(UUID transactionId, final ApiCallback _callback) throws ApiException {
        return super.getLivenessTransactionInfoAsync(transactionId, _callback);
    }

    public TransactionInfo getLivenessTransactionInfo(UUID transactionId) throws ApiException {
        return super.getLivenessTransactionInfo(transactionId);
    }

    public ApiResponse<TransactionInfo> getLivenessTransactionInfoWithHttpInfo(UUID transactionId) throws ApiException {
        return super.getLivenessTransactionInfoWithHttpInfo(transactionId);
    }

    public okhttp3.Call getLivenessTransactionInfoAsync(UUID transactionId, final ApiCallback<TransactionInfo> _callback) throws ApiException {
        return super.getLivenessTransactionInfoCall(transactionId, _callback);
    }
}
