package com.pietervaneeckhout.controller.delegates;

import com.pietervaneeckhout.service.NewsService;
import com.pietervaneeckhout.service.PersonaliaService;
import com.pietervaneeckhout.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pveeckhout
 */
public class FooterDelegate {

    private NewsService newsService;
    private SocialMediaService socialMediaService;
    private PersonaliaService personaliaService;

    @Autowired
    public FooterDelegate(NewsService newsService, SocialMediaService socialMediaService, PersonaliaService personaliaService) {
        this.newsService = newsService;
        this.socialMediaService = socialMediaService;
        this.personaliaService = personaliaService;
    }

    public ModelAndView addFooterObjects(ModelAndView model) {
        model.addObject("newsList", newsService.getNews());
        model.addObject("personalia", personaliaService.getPersonalia());
        model.addObject("socialMedialist", socialMediaService.getSocialmediaItems());

        model.addObject("testMessage", "SHIT IS WORKING");

        return model;
    }
}
