package com.pietervaneeckhout.model;

/**
 *
 * @author pveeckhout
 */
public class PortfolioItem {

    public static PortfolioItem create(String imageLocation, String title, String content, String buttonText, String link) {
        return new PortfolioItem(imageLocation, title, content, buttonText, link);
    }
    
    private String imageLocation;
    private String title;
    private String content;
    private String buttonText;
    private String link;

    private PortfolioItem(String imageLocation, String title, String content, String buttonText, String link) {
        this.imageLocation = imageLocation;
        this.title = title;
        this.content = content;
        this.buttonText = buttonText;
        this.link = link;
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
