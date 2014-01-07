package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.service.ImageService;


public class ImageServiceStaticItems implements ImageService {

    @Override
    public String getImageLocationByName(String name) {
        if (name.equals("indexHeader")){
            return "./images/header.jpg";
        }
        if (name.equals("portfolioBachPaper")){
            return "./images/neural-network.jpg";
        }
        if (name.equals("portfoliojDesign")){
            return "./images/jDesign.jpg";
        }
        if (name.equals("portfolioWebsite")){
            return "./images/website.jpg";
        }
        if (name.equals("portfolioWaypointConverter")){
            return "./images/waypointconverter.jpg";
        }
        if (name.equals("aboutProfilePicture")){
            return "./images/profilepicture2.jpg";
        }
        if (name.equals("aboutHeader")){
            return "./images/aboutHeader.jpg";
        }
        
        throw new IndexOutOfBoundsException("Image resource not found: " + name);
    }    
}
