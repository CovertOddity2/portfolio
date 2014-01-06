/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pietervaneeckhout.service;

import com.pietervaneeckhout.model.NewsItem;
import java.util.ArrayList;
import java.util.List;


public class NewsServiceImpl implements NewsService {

    @Override
    public List<NewsItem> getNews() {
        return new ArrayList<NewsItem>();
    }
    
}
