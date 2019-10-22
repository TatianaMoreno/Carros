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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 *  Clase que guarda toda la logica para guardar los carrosy registrarlos
 * @author Tatiana Moreno, Andres Chila
 */
@Named
@ViewScoped
public class MenuCarro implements  Serializable{
    //Variable que guarda 
    private String car;  
    //Variable que guarda la lista de marcas que puede tener un carro
    private List<String> marca;
    //Variable que guarda el nombre del carro
    private String nombre;
    //Variable que guarda el modelo del carro
    private Date modelo;
    //Objeto de tipo carro 
    private Carro carro;
    //Variable que guarda la lista de carros que se registran
    private static List<Carro> listarCarros;
    //Variable que guarda la lista de carros que se filtran 
    private List<Carro> filteredCars;
    /**
     * Primer metodo de la clase
     */
    @PostConstruct
    public void init() {
        marca = new ArrayList<>();
        marca.add("Jeep");
        marca.add("Alfa Romeo");
        marca.add("Aston Martin");
        marca.add("Audi");
        marca.add("Bentley");
        marca.add("BMW");
        marca.add("Bugatti");
        marca.add("Cadillac");
        marca.add("Chevrolet");
        marca.add("Ferrari");
        marca.add("Fiat");
        marca.add("Ford");
        marca.add("Honda");
        marca.add("Hyundai");
        marca.add("Jaguar");
        marca.add("Lotus");
        marca.add("Mazda");
        marca.add("Mercedes-Benz");
        marca.add("Mitsubishi");
        marca.add("Nissan");
        marca.add("Peugeot");
        marca.add("SEAT");
        marca.add("Tesla");
        marca.add("Toyota");
        marca.add("Volkswagen");
        marca.add("Volvo");
        
        listarCarros = new ArrayList<>();
        
    }
    /**
     * Metodo que gusrada el registro de carros
     */
    public void createCars() {
        listarCarros.add(new Carro(getNombre(),getCar(), getModelo()));
    }
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Se edito el carro: ", ((Carro) event.getObject()).getNombreCarro());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada para: ", ((Carro) event.getObject()).getNombreCarro());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cambio la celda", "Antigua: " + oldValue + ", Nueva:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    public MenuCarro() {
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public List<String> getMarca() {
        return marca;
    }

    public void setMarca(List<String> marca) {
        this.marca = marca;
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

    public List<Carro> getListarCarros() {
        return listarCarros;
    }

    public void setListarCarros(List<Carro> listarCarros) {
        MenuCarro.listarCarros = listarCarros;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<Carro> filteredCars) {
        this.filteredCars = filteredCars;
    }

    
}
