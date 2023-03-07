package org.example;

public class User {
    private String login;
    private String email;
    public User(String login, String email) throws IllegalArgumentException {
        if (email.equals(login)) {
            throw new IllegalArgumentException();
        } else if (!checkEmails(email)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        this.email = email;
    }
    public User() {
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean checkEmails(String email) {
        return email.contains("@") & email.contains(".");
    }
}

