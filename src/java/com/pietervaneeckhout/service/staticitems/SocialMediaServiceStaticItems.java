package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.model.SocialMediaItem;
import com.pietervaneeckhout.service.SocialMediaService;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaServiceStaticItems implements SocialMediaService {

    @Override
    public List<SocialMediaItem> getSocialmediaItems() {
        ArrayList<SocialMediaItem> socialList = new ArrayList<SocialMediaItem>();
        
        
        
        return socialList;
    }

    @Override
    public SocialMediaItem getByName(String name) {
        if (name.equalsIgnoreCase("linkedin")) {
            return SocialMediaItem.create("LinkedIn", "http://lnkd.in/_fduZE", "icon48 icon48-3");
        }
        
        throw new IndexOutOfBoundsException("not found");
    }

}
