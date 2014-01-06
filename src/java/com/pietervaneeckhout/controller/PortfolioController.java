package com.pietervaneeckhout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pveeckhout
 */
@Controller
public class PortfolioController {
    
    private ModelAndView portfolioView;

    @RequestMapping(value = {"/portfolio"})
    public ModelAndView showAbout() {
        portfolioView = new ModelAndView("portfoilio");
        
        return portfolioView;
    }
}
