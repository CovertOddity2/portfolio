package com.pietervaneeckhout.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pveeckhout
 */
@Entity
public class SocialMediaItem implements Serializable {

    public static SocialMediaItem create(String name, String url, String imageClass) {
        return new SocialMediaItem(name, url, imageClass);
    }

    public SocialMediaItem() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 25)
    private String name;
    @Column(nullable = false, length = 50)
    private String url;
    @Column(nullable = false, length = 25)
    private String imageClass;

    private SocialMediaItem(String name, String url, String imageClass) {
        this.name = name;
        this.url = url;
        this.imageClass = imageClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageClass() {
        return imageClass;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }
    
    
}
