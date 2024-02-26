public class Main {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(1, "Perro Pepe", 5, "Peludo", "Pienso", 4, "Gestante", "marron","Ciudad" );
        Ave ave = new Ave(2, "Perico", 2, "Plumas", "Semillas", 50, "Vuelo Bajo", "Verde", "Ganchudo" );
        Reptil reptil = new Reptil(3, "Juancho", 25, "Escamosa", "Insectos",  1.5, "Verdes", "nervioso", "Rio" );

        System.out.println(mamifero.saludar());
        System.out.println(ave.saludar());
        System.out.println(reptil.saludar());

        //Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? Que se lo puedo asignar pero crea un animal no tiene los atributos
        //especificos de mamifero, y no se puede acceder a ellos.
        // ¿Es posible hacer esto?
        // Posible si es pero no le puedes asignar los atributos del mamifero al animal porque la clase animal no los tiene
        // ¿Se aplica alguna propiedad para esto? Se aplica herencia y polimorfismo
        Animal animal1 = mamifero;
        Animal animal2 = new Mamifero(1, "Perro Pepe", 5, "Peludo", "Pienso", 4, "Gestante", "marron","Ciudad" );

        System.out.println(animal1.getEdad() + animal1.saludar()+animal1.getTipoAlimentacion() );
        System.out.println(animal2.getTipoAlimentacion());

        //Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos.
        // ¿Qué sucede? Que me aparece un error y si lo ejecuto me lanza este error java: getTipoReproduccion() has private access in Mamifero
        // ¿Es posible hacer esto? no porque al ser privado solo se puede acceder desde la propia clase
        System.out.println(mamifero.getTipoReproduccion());

        System.out.println("EJERCICIO 2 HERENCIA Y POLIMORFISMO");

        Vestimenta[] vectorVestimenta = new Vestimenta[9];
        vectorVestimenta[0] = new Zapato(1, "Mocasines", 55, "Lotus", "45" , "Marron", "Piel", "Cordones");
        vectorVestimenta[1] = new Zapato(2, "Nauticos", 40, "Docker", "42" , "Marron", "Sintetico", "Hebilla");
        vectorVestimenta[2] = new Zapato(3, "Botines", 90, "Lotus", "46.5" , "Marron", "Piel", "Cordones");
        vectorVestimenta[3] = new Pantalon(4,"Docker", 68, "Docker", "48", "Marron", "Sport", "Tela");
        vectorVestimenta[4] = new Pantalon(5,"Chinos", 68, "Docker", "48", "Marron", "Sport", "Tela");
        vectorVestimenta[5] = new Pantalon(6,"Vaqueros", 68, "Docker", "48", "Azul", "Sport", "Vaquera");
        vectorVestimenta[6] = new Camiseta(7, "T-shirt", 12, "Levis", "XL", "Blanco", "Corta", "Cerrado");
        vectorVestimenta[7] = new Camiseta(8, "Cuello vuelto", 20, "Xampp", "XL", "Negro", "Larga", "Vuelto");
        vectorVestimenta[8] = new Sombrero(9, "Bombin", 35, "Benneton", "54", "Negro", "Vestir",  "XL");

        for(Vestimenta prenda: vectorVestimenta){
            System.out.println(prenda.muestraMarca());
        }


    }
}
