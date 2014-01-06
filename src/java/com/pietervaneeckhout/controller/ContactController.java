package com.pietervaneeckhout.controller;

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


    @RequestMapping(value = {"/contact"})
    public ModelAndView showAbout() {
        contactView = new ModelAndView("contact");
        
        return contactView;
    }
}
