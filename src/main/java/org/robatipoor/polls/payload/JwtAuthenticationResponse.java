package org.robatipoor.polls.payload;

import java.util.Objects;

/**
 * JwtAuthenticationResponse
 */
public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse() {
    }

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public JwtAuthenticationResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public JwtAuthenticationResponse tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JwtAuthenticationResponse)) {
            return false;
        }
        JwtAuthenticationResponse jwtAuthenticationResponse = (JwtAuthenticationResponse) o;
        return Objects.equals(accessToken, jwtAuthenticationResponse.accessToken)
                && Objects.equals(tokenType, jwtAuthenticationResponse.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenType);
    }

    @Override
    public String toString() {
        return "{" + " accessToken='" + getAccessToken() + "'" + ", tokenType='" + getTokenType() + "'" + "}";
    }

}
