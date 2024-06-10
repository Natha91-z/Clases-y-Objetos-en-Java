package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase persona.Persona");
        Persona objeto1 = new Persona("Zoe","Gutierrez");
        objeto1.mostrarPersona();

        var objeto2 = new Persona("Nathalia", "Gutierrez");
        objeto2.mostrarPersona();
    }
}
