package com.pietervaneeckhout.controller;

import com.pietervaneeckhout.controller.delegates.FooterDelegate;
import com.pietervaneeckhout.controller.delegates.HeaderDelegate;
import com.pietervaneeckhout.service.AboutService;
import com.pietervaneeckhout.service.ImageService;
import com.pietervaneeckhout.service.PersonaliaService;
import com.pietervaneeckhout.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pveeckhout
 */
@Controller
public class AboutController {

    private ModelAndView aboutView;
    private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;
    private SocialMediaService socialMediaService;
    private AboutService aboutService;
    private PersonaliaService personaliaService;
    private ImageService imageService;

    @Autowired
    public AboutController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate, AboutService aboutService, SocialMediaService socialMediaService, PersonaliaService personaliaService, ImageService imageService) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
        this.socialMediaService = socialMediaService;
        this.aboutService = aboutService;
        this.personaliaService = personaliaService;
        this.imageService = imageService;
    }

    public void setSocialMediaService(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    public void setAboutService(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    public void setPersonaliaService(PersonaliaService personaliaService) {
        this.personaliaService = personaliaService;
    }

    @RequestMapping(value = {"/about"})
    public ModelAndView showAbout() {
        aboutView = new ModelAndView("about");
        
        aboutView.addObject("linkedin", socialMediaService.getByName("linkedin"));
        aboutView.addObject("personalia", personaliaService.getPersonalia());
        aboutView.addObject("profilepicture", imageService.getImageLocationByName("aboutProfilePicture"));
        aboutView.addObject("aboutHeader", imageService.getImageLocationByName("aboutHeader"));
        aboutView.addObject("cvURL", "./pdf/CV_Dutch.pdf"); //TODO use aboutService to load the content
        
        headerDelegate.setActiveMenuIten(aboutView);
        footerDelegate.addFooterObjects(aboutView);

        return aboutView;
    }
}
