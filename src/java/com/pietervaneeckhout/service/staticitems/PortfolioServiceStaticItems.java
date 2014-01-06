package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.model.PortfolioItem;
import com.pietervaneeckhout.service.PortfolioService;
import java.util.ArrayList;
import java.util.List;

public class PortfolioServiceStaticItems implements PortfolioService {

    @Override
    public List<PortfolioItem> getPortfoiliItems() {
        ArrayList<PortfolioItem> portfolioList = new ArrayList<PortfolioItem>();

        portfolioList.add(PortfolioItem.create("neural-network.jpg", "Bachelor paper",
                "This thesis is divided into several parts, \n"
                + " The thesis starts out by researching what CAPTCHAs are. \n"
                + " After that the thesis focuses on what neural networks are and how they function.\n"
                + " Lastly an experimental implementation is tested and discussed.", "Source and info",
                "https://github.com/pveeckhout/bachelor-thesis"));

        portfolioList.add(PortfolioItem.create("jDesign.jpg", "jDesignPatterns",
                "This project was created as a test to see if it was possible to create a\n"
                + " library containing a generic implementation of almost all design patterns\n"
                + " implemented in Java.", "Source and info", "https://bitbucket.org/pveeckhout/jdesignpatterns"));

        portfolioList.add(PortfolioItem.create("website.jpg", "This site",
                "This site has gone through several reworks. First it was a pure HTML5 site,\n"
                + " a few reworks later this site is now running on the java Spring framework.\n"
                + " <br /> The implementation of the tiles framework did introduce an easier to manage site.",
                "Source", "https://github.com/pveeckhout/portfolio"));

        portfolioList.add(PortfolioItem.create("waypoint-converter.jpg", "Waypoint converter",
                "This is a waypoint converter ii coded for my father. It converts coordinates generated "
                + "by mapsource to a coordinate list file that can be used with our cars' build-in GPS system.<br />"
                + " Development has stagnated as the program functions well enough for our use. "
                + "If new feature requests or bugfixes are submitted, I would implement them as soon as possible",
                "Source and info", "https://github.com/pveeckhout/WaypointConverter"));

        return portfolioList;
    }

}