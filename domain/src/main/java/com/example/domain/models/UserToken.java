package com.example.domain.models;

public class UserToken {
    private boolean isError;
    private long userID;
    private boolean isValid;
    private User user;

    public boolean isError() {
        return isError;
    }

    public long getUserID() {
        return userID;
    }
    public boolean isValid(){
        return isValid;
    }

    public User getUser() {
        return user;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
