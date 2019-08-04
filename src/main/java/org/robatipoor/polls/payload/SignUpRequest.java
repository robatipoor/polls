package org.robatipoor.polls.payload;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * SignUpRequest
 */
public class SignUpRequest {

    @NotBlank
    @Size(min = 3, max = 40)
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    public SignUpRequest() {
    }

    public SignUpRequest(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SignUpRequest name(String name) {
        this.name = name;
        return this;
    }

    public SignUpRequest username(String username) {
        this.username = username;
        return this;
    }

    public SignUpRequest email(String email) {
        this.email = email;
        return this;
    }

    public SignUpRequest password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SignUpRequest)) {
            return false;
        }
        SignUpRequest signUpRequest = (SignUpRequest) o;
        return Objects.equals(name, signUpRequest.name) && Objects.equals(username, signUpRequest.username)
                && Objects.equals(email, signUpRequest.email) && Objects.equals(password, signUpRequest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, username, email, password);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", username='" + getUsername() + "'" + ", email='" + getEmail() + "'"
                + ", password='" + getPassword() + "'" + "}";
    }

}