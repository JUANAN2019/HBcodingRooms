public class Main {

    public static void main(String[] args) {
        //Ejercicio Nº 1 - Clases y Objetos - Individual
        Electrodomestico lavadora = new Electrodomestico("Teka", "TekaUltra", 23.12);
        Electrodomestico nevera = new Electrodomestico("Fagor", "No-frost", 12.34);
        Electrodomestico lavavajillas = new Electrodomestico("Zanussi", "Ultra Clean", 15.50);

        Electrodomestico microondas = new Electrodomestico();

        System.out.println(lavadora.getMarca()+ " "+lavadora.getModelo()+" "+lavadora.getConsumo());
        System.out.println(lavavajillas.getMarca()+ " "+lavavajillas.getModelo()+" "+lavavajillas.getConsumo());
        System.out.println(nevera.getMarca()+ " "+nevera.getModelo()+" "+nevera.getConsumo());


        System.out.println(microondas.getMarca()+ " "+microondas.getModelo()+" "+microondas.getConsumo());


        //Ejercicio Nº 2 - POO - Individual

        Persona[] personas = new Persona[5];

        Persona persona1 = new Persona(1, "Juan", 24, "Calle menorca 32", "111111111");
        Persona persona2 = new Persona(2, "Pedro", 35, "Calle Ibiza 12", "2222222222");
        Persona persona3 = new Persona(3, "Luis", 45, "Calle Narvaez 16", "3333333333");
        Persona persona4 = new Persona(4, "Maria", 23, "Calle Maiquez 59", "444444444");
        Persona persona5 = new Persona(5, "Olga", 69, "Calle Odonell 34", "555555555");

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        personas[4] = persona5;

        for(Persona persona: personas){
            System.out.println("El nombre es: "+persona.getNombre()+ " y tiene "+persona.getEdad()+ " años.");
        }

        System.out.println("Punto C");
        System.out.println("ID NOMBRE   EDAD  DIRECCION         TELEFONO  ");
        for(Persona persona: personas){
            if(persona.getNombre().equals("Juan")  || persona.getNombre().equals("Pedro")){
                System.out.println(persona.getId()+"   "+ persona.getNombre()+"   "+persona.getEdad()+"   "+persona.getDireccion()+"   "+persona.getTelefono());
            }
        }
        personas[0].setNombre("Pilar");
        personas[1].setNombre("Pepe");


        System.out.println("NOMBRES YA CAMBIADOS");
        for(Persona persona: personas){
            if(persona.getNombre().equals("Pepe")  || persona.getNombre().equals("Luis")){
                System.out.println(persona.getId()+"   "+ persona.getNombre()+"   "+persona.getEdad()+"   "+persona.getDireccion()+"   "+persona.getTelefono());
            }
        }



        System.out.println("MAYORES DE 30");
        System.out.println("ID NOMBRE  EDAD    DIRECCION       TELEFONO  ");
        for(Persona persona: personas){
            if(persona.getEdad() > 30 ){
                System.out.println(persona.getId()+"   "+ persona.getNombre()+"   "+persona.getEdad()+"   "+persona.getDireccion()+"   "+persona.getTelefono());
            }

        }
    }
}