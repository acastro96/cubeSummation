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
public class OperacionDaoImpl implements IOperacionDao{

    @Override
    public String saveCube(Operacion operacion) {
        
        //Aqui hago el codigo de FireBase
        
        return "Datos guardados exitosamente";
        
    }

    
}
