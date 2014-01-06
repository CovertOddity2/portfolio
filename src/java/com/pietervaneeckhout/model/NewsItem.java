package com.pietervaneeckhout.model;

import org.joda.time.DateTime;

/**
 *
 * @author pveeckhout
 */
public class NewsItem {
    
    private DateTime date;
    private String title;
    private String message;

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
