package jagg.clase10dia11ej1voto.logica;

import jagg.clase10dia11ej1voto.persistencia.ControladoraPersistencia;

import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVoto (Voto voto) {
        controlPersis.crearVoto(voto);
    }

    public void eliminarVoto (Long id) {
        controlPersis.eliminarVoto(id);
    }

    public List<Voto> traerVotos () {
        return controlPersis.traerVotos();
    }

    public void editarVoto (Voto voto) {
        controlPersis.editarVoto(voto);
    }

}
