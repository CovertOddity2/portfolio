package com.pietervaneeckhout.service;

import com.pietervaneeckhout.model.NewsItem;
import java.util.List;

/**
 *
 * @author pveeckhout
 */
public interface NewsService {
    
    public List<NewsItem> getNews();
}
