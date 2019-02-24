package com.zy.blog.common;

public class AlertMessage {
    private String message;
    private String type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlertMessage(String message, String type) {
        this.message = message;
        this.type = type;
    }
}
