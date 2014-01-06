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
public class CvController {
    
    private ModelAndView cvView;
     private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;

    @Autowired
    public CvController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
    }
      
    @RequestMapping(value = {"/cv"})
    public ModelAndView showAbout() {
        cvView = new ModelAndView("cv");
        
        headerDelegate.setActiveMenuIten(cvView);
        footerDelegate.addFooterObjects(cvView);
        
        return cvView;
    }
}
