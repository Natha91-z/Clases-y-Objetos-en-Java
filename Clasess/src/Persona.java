import java.sql.SQLOutput;

public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre" +nombre);
        System.out.println("Apellido" +apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase Persona");
        Persona objeto1 = new Persona();
        objeto1.nombre = "Zoe";
        objeto1.apellido = "Gutierrez";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Nathalia";
        objeto2.apellido = "Gutierrez";
        objeto2.mostrarPersona();
    }
}

