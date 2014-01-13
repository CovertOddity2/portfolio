package com.pietervaneeckhout.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

/**
 *
 * @author pveeckhout
 */
@Entity
@Table(name = "NewsItems")
public class NewsItem implements Comparable<NewsItem>, Serializable {

    public static NewsItem create(DateTime date, String title, String message) {
        return new NewsItem(date, title, message);
    }

    public NewsItem() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;   
    @Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
    @Column(name = "date", nullable = false)
    private DateTime date;
    @Column(name = "title", nullable = false, length = 25)
    private String title;
    @Column(name = "message", nullable = false, length = 255)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(NewsItem o) {
        return this.date.compareTo(o.getDate());
    }
}
