package com.pietervaneeckhout.controller.delegates;

import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pveeckhout
 */
public class HeaderDelegate {
    
    public ModelAndView setActiveMenuIten(ModelAndView model) {
        
        model.addObject("viewName", model.getViewName());
        
        return model;
    }
}
