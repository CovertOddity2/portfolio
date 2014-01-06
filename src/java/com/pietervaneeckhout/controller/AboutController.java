package com.pietervaneeckhout.controller;

import com.pietervaneeckhout.controller.delegates.FooterDelegate;
import com.pietervaneeckhout.controller.delegates.HeaderDelegate;
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

    @Autowired
    public AboutController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
    }

    @RequestMapping(value = {"/about"})
    public ModelAndView showAbout() {
        aboutView = new ModelAndView("about");
        
        headerDelegate.setActiveMenuIten(aboutView);
        footerDelegate.addFooterObjects(aboutView);

        return aboutView;
    }
}
