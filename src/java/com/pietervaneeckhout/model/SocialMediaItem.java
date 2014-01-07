package com.pietervaneeckhout.model;

/**
 *
 * @author pveeckhout
 */
public class SocialMediaItem {

    public static SocialMediaItem create(String name, String url, String imageClass) {
        return new SocialMediaItem(name, url, imageClass);
    }
    private String name;
    private String url;
    private String imageClass;

    private SocialMediaItem(String name, String url, String imageClass) {
        this.name = name;
        this.url = url;
        this.imageClass = imageClass;
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
