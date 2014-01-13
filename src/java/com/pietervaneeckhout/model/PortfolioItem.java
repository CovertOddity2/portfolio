package com.pietervaneeckhout.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pveeckhout
 */
@Entity
@Table(name = "PortfolioItems")
public class PortfolioItem implements Serializable {

    public static PortfolioItem create(String imageLocation, String title, String content, String buttonText, String link) {
        return new PortfolioItem(imageLocation, title, content, buttonText, link);
    }

    public PortfolioItem() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 25)
    private String imageLocation;
    @Column(nullable = false, length = 25)
    private String title;
    @Column(nullable = false, length = 512)
    private String content;
    @Column(nullable = false, length = 25)
    private String buttonText;
    @Column(nullable = false, length = 50)
    private String link;

    private PortfolioItem(String imageLocation, String title, String content, String buttonText, String link) {
        this.imageLocation = imageLocation;
        this.title = title;
        this.content = content;
        this.buttonText = buttonText;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
