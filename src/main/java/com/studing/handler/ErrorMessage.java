package com.studing.handler;

import java.util.Date;

public class ErrorMessage {

    private Date currentDate;
    private String message;

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(Date currentDate, String message) {
        this.currentDate = currentDate;
        this.message = message;
    }

    public ErrorMessage() {

    }
}
