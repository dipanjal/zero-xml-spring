package com.springtest.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    private Long userId;
    @NotNull(message = "Username cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[a-zA-Z0-9-_]$", message = "Invalid format it can only take A-Z, a-z, 0-9, -, _")
    private String userName;
    @NotNull(message = "First Name cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[a-zA-Z]$", message = "Invalid format it can only take A-Z, a-z")
    private String firstName;
    @NotNull(message = "Last Name cannot be empty")
    @Size(min = 4, max = 20, message = "Size needs to be between 4-20")
    @Pattern(regexp = "^[a-zA-Z]$", message = "Invalid format it can only take A-Z, a-z")
    private String lastName;
    private boolean enabled;
    @NotNull
    private String gender;
    @NotNull
    @Pattern(regexp = "$[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message = "Invalid Email Format")
    private String email;

    public User() {
    }

    public User(Long userId, String userName, String firstName, String lastName, boolean enabled, String gender, String email) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.gender = gender;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
