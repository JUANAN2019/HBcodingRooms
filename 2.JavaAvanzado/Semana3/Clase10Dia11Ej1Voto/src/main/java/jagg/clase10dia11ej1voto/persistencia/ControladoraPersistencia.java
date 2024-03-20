package jagg.clase10dia11ej1voto.persistencia;

import jagg.clase10dia11ej1voto.logica.Voto;
import jagg.clase10dia11ej1voto.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUNAN
 */
public class ControladoraPersistencia {
     VotoJpaController votoJPA = new VotoJpaController();
    
    public void crearVoto (Voto voto) {
        votoJPA.create(voto);
    }
    
    public void eliminarVoto (Long id) {
        try {
            votoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Voto> traerVotos () {
    return votoJPA.findVotoEntities();
    }
    
    public void editarVoto (Voto voto) {
        try {
            votoJPA.edit(voto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
