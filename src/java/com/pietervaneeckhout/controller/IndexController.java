package com.pietervaneeckhout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pveeckhout
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = {"/index" , "/"} )
    public String showIndex() {
        return "index";
    }
}
