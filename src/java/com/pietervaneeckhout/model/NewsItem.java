package com.pietervaneeckhout.model;

import org.joda.time.DateTime;

/**
 *
 * @author pveeckhout
 */
public class NewsItem implements Comparable<NewsItem>{

    public static NewsItem create(DateTime date, String title, String message) {
        return new NewsItem(date, title, message);
    }
    
    private DateTime date;
    private String title;
    private String message;

    private NewsItem(DateTime date, String title, String message) {
        this.date = date;
        this.title = title;
        this.message = message;
    }

    public String getMonthAsText() {
        return date.monthOfYear().getAsText();
    }
    
    public int getDay() {
        return date.dayOfMonth().get();
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public DateTime getDate() {
        return date;
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

    @Override
    public int compareTo(NewsItem o) {
        return this.date.compareTo(o.getDate());
    }
}
