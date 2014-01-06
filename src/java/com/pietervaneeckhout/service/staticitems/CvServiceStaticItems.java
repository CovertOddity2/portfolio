package com.pietervaneeckhout.service.staticitems;

import com.pietervaneeckhout.service.CvService;


public class CvServiceStaticItems implements CvService {

    @Override
    public String getCvUrl() {
        return "./pdf/CV_Dutch.pdf";
    }

    @Override
    public String getGithubUrl() {
       return "https://github.com/pveeckhout/curriculumvitae";
    }
    
}
