/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclase8dia9jpa.persistencia;

import com.mycompany.ejercicioclase8dia9jpa.logica.Plato;
import com.mycompany.ejercicioclase8dia9jpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUNAN
 */
public class ControladoraPersistencia {
    
    PlatoJpaController platoJPA = new PlatoJpaController();

  public void crearPlato(Plato plato) {
       platoJPA.create(plato);
    }

    public void borrarPlato(long id) {
        try {
            platoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Plato> traerPlatos () {
        return platoJPA.findPlatoEntities();
    }

    public void modificarPlato (Plato plato) {
        try {
            platoJPA.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
