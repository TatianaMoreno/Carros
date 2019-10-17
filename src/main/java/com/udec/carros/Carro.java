/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.carros;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tmore
 */
public class Carro {

    private String nombreCarro;
    private String marcaCarro;
    private Date modeloCarro;
    private int fecha;

    public Carro(String nombreCarro, String marcaCarro, Date modeloCarro) {
        this.nombreCarro = nombreCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.fecha=obtenerAnio(modeloCarro);
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public Date getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(Date modeloCarro) {
        this.modeloCarro=modeloCarro;
    }

    public int obtenerAnio(Date modeloCarro) {
        if (null == modeloCarro) {
            return 0;
        } else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy");
            return Integer.parseInt(format.format(modeloCarro));
        }
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(Date modeloCarro) {
        this.fecha = obtenerAnio(modeloCarro);
    }
    
}
