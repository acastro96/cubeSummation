/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acastro.restapi.dao;

import com.acastro.restapi.model.Operacion;

/**
 *
 * @author Usuario
 */
public interface IOperacionDao {
    
    public String saveCube(Operacion operacion);
    
}
