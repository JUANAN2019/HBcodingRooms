/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclase8dia9jpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plato implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String receta; 
    private double precio;

    public Plato() {
    }

    public Plato( String nombre, String receta, double precio) {
       
        
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato{" + "id=" + id + ", nombre=" + nombre + ", receta=" + receta + ", precio=" + precio + '}';
    }
    
    
    
}
