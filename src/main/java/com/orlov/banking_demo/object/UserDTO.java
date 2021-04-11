package com.orlov.banking_demo.object;

public class UserDTO {

    private String email;
    private String password;
    private String rpassword;

    public UserDTO() {
    }

    public UserDTO(String email, String password, String rpassword) {
        this.email = email;
        this.password = password;
        this.rpassword = rpassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", rpassword='" + rpassword + '\'' +
                '}';
    }
}
