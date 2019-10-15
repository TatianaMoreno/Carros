/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.carros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author tmore
 */
@Named
@ViewScoped
public class MenuCarro implements  Serializable{
    private String car;  
    private List<String> marca;
    private String nombre;
    private Date modelo;
    private List<Carro> listarCarros;
    @PostConstruct
    public void init() {
        marca = new ArrayList<>();
        marca.add("YO QUE SE");
        marca.add("NO SE DE CARROS");
        listarCarros = new ArrayList<>();
    }
    public List<Carro> createCars() {
        List<Carro> listarCarros = new ArrayList<Carro>();
        listarCarros.add(new Carro(getNombre(),getCar(), getModelo()));
        return listarCarros;
    }
    public MenuCarro() {
    }

    public List<String> getCars() {
        return marca;
    }

    public void setCars(List<String> cars) {
        this.marca = cars;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }
    
    
}