/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.model.SocialMediaItem;
import com.pietervaneeckhout.service.SocialMediaService;
import java.util.ArrayList;
import java.util.List;


public class SocialMediaServiceStaticItems implements SocialMediaService {

    @Override
    public List<SocialMediaItem> getSocialmediaItems() {
        return new ArrayList<SocialMediaItem>();
    }
    
}
