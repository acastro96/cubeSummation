/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acastro.restapi.conf;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Acastro
 */

@ApplicationPath("/api")
public class AppConf extends ResourceConfig{
    
    public AppConf() {
        packages("com.acastro.restapi.api");
    }
}
