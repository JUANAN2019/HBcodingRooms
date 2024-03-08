public class Operario implements Runnable{
    private String nombre;
    private EstacionDeTrabajo estacionTrabajo;


    public Operario(String nombre, EstacionDeTrabajo estacionTrabajo) {
        this.nombre            = nombre;
        this.estacionTrabajo = estacionTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstacionDeTrabajo StrigetEstacionTrabajo() {
        return estacionTrabajo;
    }

    public void setEstacionTrabajo(EstacionDeTrabajo estacionTrabajo) {
        this.estacionTrabajo = estacionTrabajo;
    }

    @Override
    public void run() {
        String nombreEstacion = estacionTrabajo.getNombre();
        switch (nombreEstacion) {
            case "Calidad":
                controlarCalidad();
                break;
            case "Ensamblar":
                ensamblarProducto();
                break;
            case "Empaquetar":
                embalarProducto();
                break;
            default:
                // Acción por defecto si no se encuentra el nombre de la estación de trabajo
                break;
        }
    }
    public void ensamblarProducto(){
        System.out.println("Soy "+nombre+" y estoy ensamblando producto");
    }
    public void controlarCalidad(){
        System.out.println("Soy "+nombre+" y estoy controlando calidad del  producto");
    }
    public void embalarProducto(){
        System.out.println("Soy "+nombre+" y estoy empaquetando el  producto");
    }
}
