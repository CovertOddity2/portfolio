/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pietervaneeckhout.service;

import com.pietervaneeckhout.model.Personalia;


public class PersonaliaServiceImpl implements PersonaliaService {

    @Override
    public Personalia getPersonalia() {
        return new Personalia();
    }
    
}
