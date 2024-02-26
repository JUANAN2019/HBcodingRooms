public class Main {
    public static void main(String[] args) {

        int verdes = 0;
        Verdura verduras[] = new Verdura[5];

        verduras[0] = new Verdura(1, "Acelga", "Verdes", 50 , true);
        verduras[1] = new Verdura(2, "Lechuga", "Verde", 40 , false);
        verduras[2] = new Verdura(3, "Repollo", "Verde", 70 , false);
        verduras[3] = new Verdura(4, "Judia Verde", "Verdes", 65 , true);
        verduras[4] = new Verdura(5, "Zanahorria", "Naranja", 80 , true);

        for(Verdura verdura: verduras){
            System.out.println("las Calorias de la verdura: "+verdura.getNombre()+ " son: "+verdura.getCalorias());
        }

        for(Verdura verdura: verduras){
            System.out.println("Nombre: "+verdura.getNombre()+ " Calorias: "+verdura.getCalorias()+ " Color: "+verdura.getColor()+ " debe cocinarse: "+verdura.isDebeCocinarse()+ " Id:" +verdura.getId());
        }
        verduras[1].setColor("Morado");
        verduras[1].setNombre("Lombarda");
        verduras[1].setCalorias(85);
        verduras[1].setDebeCocinarse(true);

        verduras[2].setColor("Verde claro");
        verduras[2].setNombre("Apio");
        verduras[2].setCalorias(48);
        verduras[2].setDebeCocinarse(false);

        System.out.println("Datos de verduras con cambios en dos de ellas");
        for(Verdura verdura: verduras){
            System.out.println("Nombre: "+verdura.getNombre()+ " Calorias: "+verdura.getCalorias()+ " Color: "+verdura.getColor()+ " debe cocinarse: "+verdura.isDebeCocinarse()+ " Id:" +verdura.getId());
        }
        System.out.println("Solo mostrar verduras verdes");
        for(Verdura verdura: verduras){
            if(verdura.getColor().equalsIgnoreCase("Verde")) {
                verdes++;
                System.out.println("Nombre: " + verdura.getNombre() + " Calorias: " + verdura.getCalorias() + " Color: " + verdura.getColor() + " debe cocinarse: " + verdura.isDebeCocinarse() + " Id:" + verdura.getId());
            }
        }
        if(verdes == 0){
            System.out.println("No hay verduras que sean de color verde");
        }
    }
}
