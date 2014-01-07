package com.pietervaneeckhout.service;

import com.pietervaneeckhout.model.SocialMediaItem;
import java.util.List;

/**
 *
 * @author pveeckhout
 */
public interface SocialMediaService {
    
    public List<SocialMediaItem> getSocialmediaItems();

    public SocialMediaItem getByName(String name);
}
