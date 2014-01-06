package com.pietervaneeckhout.controller;

import com.pietervaneeckhout.controller.delegates.FooterDelegate;
import com.pietervaneeckhout.controller.delegates.HeaderDelegate;
import com.pietervaneeckhout.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pveeckhout
 */
@Controller
public class CvController {

    private ModelAndView cvView;
    private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;
    private CvService cvService;

    @Autowired
    public CvController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate, CvService cvService) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
        this.cvService = cvService;
    }

    @RequestMapping(value = {"/cv"})
    public ModelAndView showAbout() {
        cvView = new ModelAndView("cv");

        cvView.addObject("cvURL", cvService.getCvUrl());
        cvView.addObject("gitURL", cvService.getGithubUrl());
        
        headerDelegate.setActiveMenuIten(cvView);
        footerDelegate.addFooterObjects(cvView);

        return cvView;
    }
}
