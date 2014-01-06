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
public class CvController {
    
    private ModelAndView cvView;

    
    @RequestMapping(value = {"/cv"})
    public ModelAndView showAbout() {
        cvView = new ModelAndView("cv");
        
        return cvView;
    }
}
