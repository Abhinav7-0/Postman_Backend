package com.response.apiresponse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApiResponse {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String method;
    private String url;
    private int statusCode;
    private int responseTime;
    private int responseSize;
    private String responseData;
    private String queryParameters;
    private String headers;
    private String defaultTestCase;

    public ApiResponse() {
    }

    public ApiResponse(Long id, String method, String url, int statusCode, int responseTime, int responseSize,
            String responseData, String queryParameters, String headers, String defaultTestCase) {
        this.id = id;
        this.method = method;
        this.url = url;
        this.statusCode = statusCode;
        this.responseTime = responseTime;
        this.responseSize = responseSize;
        this.responseData = responseData;
        this.queryParameters = queryParameters;
        this.headers = headers;
        this.defaultTestCase = defaultTestCase;
    }

    public ApiResponse(String string, int value) {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public int getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }
    public int getResponseSize() {
        return responseSize;
    }
    public void setResponseSize(int responseSize) {
        this.responseSize = responseSize;
    }
    public String getResponseData() {
        return responseData;
    }
    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }
    public String getQueryParameters() {
        return queryParameters;
    }
    public void setQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
    }
    public String getHeaders() {
        return headers;
    }
    public void setHeaders(String headers) {
        this.headers = headers;
    }
    public String getDefaultTestCase() {
        return defaultTestCase;
    }
    public void setDefaultTestCase(String defaultTestCase) {
        this.defaultTestCase = defaultTestCase;
    }

    @Override
    public String toString() {
        return "ApiResponse [id=" + id + ", method=" + method + ", url=" + url + ", statusCode=" + statusCode
                + ", responseTime=" + responseTime + ", responseSize=" + responseSize + ", responseData=" + responseData
                + ", queryParameters=" + queryParameters + ", headers=" + headers + ", defaultTestCase="
                + defaultTestCase + "]";
    }

}
