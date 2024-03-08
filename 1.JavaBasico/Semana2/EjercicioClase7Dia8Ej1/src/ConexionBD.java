import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {

    public static void main(String[] args) {



        String url = "jdbc:mysql://localhost:3306/clinica"; // URL de la base de datos "clinica"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contraseña = ""; // Contraseña de la base de datos

        //utilizamos excepciones para manejar posibles errores de conexión.
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM pacientes WHERE edad > 40"; // Cambia el nombre de la tabla a "pacientes"
            ResultSet resultado = statement.executeQuery(sql);

            // Procesa los resultados
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                String diagnostico = resultado.getString("diagnostico");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Diagnóstico: " + diagnostico);
            }

            // Cierra la conexión y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

