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
public class AboutController {

    private ModelAndView aboutView;

    @RequestMapping(value = {"/about"})
    public ModelAndView showAbout() {
        aboutView = new ModelAndView("about");
        
        return aboutView;
    }
}
