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
public class ContactController {

    private ModelAndView contactView;
    private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;

    @Autowired
    public ContactController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
    }

    @RequestMapping(value = {"/contact"})
    public ModelAndView showAbout() {
        contactView = new ModelAndView("contact");
        
        headerDelegate.setActiveMenuIten(contactView);
        footerDelegate.addFooterObjects(contactView);

        return contactView;
    }
}
