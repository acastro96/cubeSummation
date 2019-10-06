/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acastro.restapi.model;

/**
 *
 * @author Usuario
 */
public class Operacion {
    private String datosEntrada;
    private String datosSalida;

    public Operacion(String datosEntrada, String datosSalida) {
        this.datosEntrada = datosEntrada;
        this.datosSalida = datosSalida;
    }

    public Operacion() {
    }
    
    public String getDatosEntrada() {
        return datosEntrada;
    }

    public String getDatosSalida() {
        return datosSalida;
    }

    public void setDatosEntrada(String datosEntrada) {
        this.datosEntrada = datosEntrada;
    }

    public void setDatosSalida(String datosSalida) {
        this.datosSalida = datosSalida;
    }
    
    
}
