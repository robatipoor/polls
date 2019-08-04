package org.robatipoor.polls.payload;

import java.util.Objects;

/**
 * ApiResponse
 */
public class ApiResponse {

    private Boolean success;
    private String message;

    public ApiResponse() {
    }

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Boolean isSuccess() {
        return this.success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ApiResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    public ApiResponse message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) o;
        return Objects.equals(success, apiResponse.success) && Objects.equals(message, apiResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, message);
    }

    @Override
    public String toString() {
        return "{" + " success='" + isSuccess() + "'" + ", message='" + getMessage() + "'" + "}";
    }

}