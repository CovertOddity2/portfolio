/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.model.Personalia;
import com.pietervaneeckhout.service.PersonaliaService;


public class PersonaliaServiceStaticItems implements PersonaliaService {

    @Override
    public Personalia getPersonalia() {
        return Personalia.create("Pieter", "Van Eeckhout", "+32 93 67 78 10", "+32 49 17 70 50", "Jozef van de Veldestraat 27", "9270","Kalken" , "BELGIUM", "vaneeckhout.pieter@gmail.com");
    }   
}
