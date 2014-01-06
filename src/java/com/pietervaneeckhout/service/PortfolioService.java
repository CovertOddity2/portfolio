/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pietervaneeckhout.service;

import com.pietervaneeckhout.model.PortfolioItem;
import java.util.List;

/**
 *
 * @author pveeckhout
 */
public interface PortfolioService {
    
    public List<PortfolioItem> getPortfoiliItems();
    
}
