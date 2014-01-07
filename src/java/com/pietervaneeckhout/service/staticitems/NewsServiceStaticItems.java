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
        
        newsList.add(NewsItem.create(new DateTime(2013, 5, 6, 0, 0), "Website up and running", "My portfolio site is finished enough to put parts of it online. Enjoy"));
        newsList.add(NewsItem.create(new DateTime(2013, 5, 13, 0, 0), "Javscript rework", "Browsing the site should now be more smooth after a small rework of the Javascript."));
        newsList.add(NewsItem.create(new DateTime(2014, 1, 6, 0, 0),  "Spring is in the air", "The portfolio site has reworked to run on Java + Spring framework."));
        newsList.add(NewsItem.create(new DateTime(2014, 1, 7, 0, 0),  "Spring must wait", "I did not deploy the webapp due to not wanting to break other websites runnning on the server. "
                                                                        + "The static HTML pages generate by the Spring framework will be hosted instead of the dynamic webapp"
                                                                        + " until a solution is found."));
        
        Collections.sort(newsList, Collections.reverseOrder());
        
        return newsList;
    }
    
}
