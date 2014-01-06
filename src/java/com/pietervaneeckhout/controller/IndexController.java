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
public class IndexController {
    
    private ModelAndView indexView;
    private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;

    @Autowired
    public IndexController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
    }
    
    @RequestMapping(value = {"/index" , "/"} )
    public ModelAndView showIndex() {
        indexView = new ModelAndView("index");
        
        headerDelegate.setActiveMenuIten(indexView);
        footerDelegate.addFooterObjects(indexView);
        
        return indexView;
    }
}
