package com.pietervaneeckhout.controller;

import com.pietervaneeckhout.controller.delegates.FooterDelegate;
import com.pietervaneeckhout.controller.delegates.HeaderDelegate;
import com.pietervaneeckhout.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final FooterDelegate footerDelegate;
    private final HeaderDelegate headerDelegate;
    private PortfolioService portfolioService;

    @Autowired
    public PortfolioController(FooterDelegate footerDelegate, HeaderDelegate headerDelegate, PortfolioService portfolioService) {
        this.footerDelegate = footerDelegate;
        this.headerDelegate = headerDelegate;
        this.portfolioService = portfolioService;
    }

    @RequestMapping(value = {"/portfolio"})
    public ModelAndView showAbout() {
        portfolioView = new ModelAndView("portfolio");
        
        portfolioView.addObject("portfolioList", portfolioService.getPortfoiliItems());

        headerDelegate.setActiveMenuIten(portfolioView);
        footerDelegate.addFooterObjects(portfolioView);

        return portfolioView;
    }
}
