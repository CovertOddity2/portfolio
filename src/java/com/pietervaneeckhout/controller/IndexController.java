package com.pietervaneeckhout.controller;

import com.pietervaneeckhout.controller.delegates.FooterDelegate;
import com.pietervaneeckhout.controller.delegates.HeaderDelegate;
import com.pietervaneeckhout.service.ImageService;
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
    private ImageService imageService;

    @Autowired
    public IndexController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate, ImageService imageService) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
        this.imageService = imageService;
    }
    
    @RequestMapping(value = {"/index" , "/"} )
    public ModelAndView showIndex() {
        indexView = new ModelAndView("index");
        
        indexView.addObject("headerImg", imageService.getImageLocationByName("indexHeader"));
        
        headerDelegate.setActiveMenuIten(indexView);
        footerDelegate.addFooterObjects(indexView);
        
        return indexView;
    }
}
