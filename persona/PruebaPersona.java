package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase persona.Persona");
        var objeto1 = new Persona("Zoe", "Gutierrez");
        System.out.println(objeto1.toString());
        var objeto2 = new Persona("Nathalia", "Gutierrez");
        System.out.println(objeto2);
    }
}
