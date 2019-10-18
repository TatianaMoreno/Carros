/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.carros;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Clase que guarda la informacion del carro
 * @author Tatiana Moreno, Andres Chila
 */
public class Carro {
    //Variable que guarda el noimbre del carro
    private String nombreCarro;
    //Variable que guarda la marca del carro
    private String marcaCarro;
    //Variable que guarda el modelo del carro
    private Date modeloCarro;
    //Variable que guarda la fecha solo en años del modelo del carro
    private int fecha;
    /**
     * Constructor de la clsse
     * @param nombreCarro
     * @param marcaCarro
     * @param modeloCarro 
     */
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
    /**
     * Metodo que obtiene la fecha y la pone solo en año
     * @param modeloCarro
     * @return 
     */
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
