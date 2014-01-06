package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.model.NewsItem;
import com.pietervaneeckhout.service.NewsService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;


public class NewsServiceStaticItems implements NewsService {

    @Override
    public List<NewsItem> getNews() {
        List<NewsItem> newsList = new ArrayList<NewsItem>();
        
        newsList.add(NewsItem.create(new DateTime(2013, 5, 6, 0, 0), "Website up and running", "my portfolio site is finished enough to put parts of it online. Enjoy"));
        newsList.add(NewsItem.create(new DateTime(2013, 5, 13, 0, 0), "Javscript rework", "Browsing should now be more smooth after a small rework of the Javascript."));
        newsList.add(NewsItem.create(new DateTime(2014, 1, 6, 0, 0),  "Spring is in the air", "The portfoilio site has bene moved to Java + Spring framework."));
        
        Collections.sort(newsList, Collections.reverseOrder());
        
        return newsList;
    }
    
}
