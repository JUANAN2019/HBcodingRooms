/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioclase8dia9jpa;

import com.mycompany.ejercicioclase8dia9jpa.logica.Plato;
import com.mycompany.ejercicioclase8dia9jpa.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author JUNAN
 */
public class EjercicioClase8Dia9JPA {

    public static void main(String[] args) {
       ControladoraPersistencia controlPersis = new ControladoraPersistencia();
       
        
        Plato plato = new Plato("Ensalada", "Lechuga, tomate y cebolla con aceite", 8);
        
        controlPersis.crearPlato(plato);
        //Se crea un objeto persona en memoria
        //Plato plato2 = new Plato("Filete con salsa", "Freir el filete con ajo y agregar salsa", 13); 
        //Se envia el objeto para que lo PERSISTA en la BD
        controlPersis.crearPlato(new Plato("Filete con salsa", "Freir el filete con ajo y agregar salsa", 13));
        controlPersis.crearPlato(new Plato("Pasta con nueces", "Hervir pasta agregar salsa y nueces", 14));
         controlPersis.crearPlato(new Plato("Pollo frito ", "Freir pollo ", 11));
        
        //Se crean dos personas más
        
        
        //borramos el registro "Prueba Borrar" mediante su id (en este caso sería la 2)
        controlPersis.borrarPlato(12);
        
        
        plato.setPrecio(18);
        controlPersis.modificarPlato(plato); 
        
        
        //mostrar todas las personas de la tabla mediante find entities
        List<Plato> listaPlatos = controlPersis.traerPlatos();
        
        //usando for each para recorrer la collection
        System.out.println("----Lista de platos----");
        for (Plato p:listaPlatos) {
            System.out.println(p.toString());
           
        }        
    }
}
