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
public class IndexController {
    
    private ModelAndView indexView;
    
    @RequestMapping(value = {"/index" , "/"} )
    public ModelAndView showIndex() {
        indexView = new ModelAndView("index");
        
        return indexView;
    }
}
