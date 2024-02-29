import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        Auto auto1 = new Auto(1, "JKP-456", "Seat", "Leon-E", 2020, 20000, 200, 400);
        Camioneta camioneta1 = new Camioneta(2, "HSD-234", "NISSAN", "Cargo-2", 2009, 15500, 70, 12 );
        Moto moto1 = new Moto(3, "LFD-345", "Duccati", "Speed", 2022, 22000, 1100, "Dos tiempos");

        listaVehiculos.add(auto1);
        listaVehiculos.add(camioneta1);
        listaVehiculos.add(moto1);


        for(Vehiculo v : listaVehiculos){

            String tipo = String.valueOf(v.getClass()).substring(6);

            System.out.print("Id: "+v.getId()+" Placa: "+v.getPlaca()+" Marca: "+v.getMarca()+" Modelo: "+v.getModelo()+" Año: "+v.getAño()+ " Costo: "+v.getCosto()+" Antiguedad: "+v.calcularAntiguedad()+ " años.");
            switch (tipo){
                case "Auto":
                    Auto a = (Auto) v;
                    System.out.println(" Capacidad bateria: "+a.getCapacidadBateria()+ " mah. Autonomia: "+a.getAutonomia()+ " hs");
                    break;
                case "Camioneta":
                    Camioneta c = (Camioneta) v;
                    System.out.println(" Capacidad de tanque "+ c.getCapacidadTanque()+ " litros. ConsumoCombustible: "+ c.getConsumoCombustible()+" litros cada 100Km");
                    break;
                case "Moto":
                    Moto m = (Moto) v;
                    System.out.println(" Cilindrada: "+m.getCilindrada()+ "cc. Tipo Motor: " +m.getTipoMotor());
                    break;
                default:
                    System.out.println("No se reconoce el tipo de vehiculo " +tipo);

            }


        }
    }
}
