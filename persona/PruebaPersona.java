package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase persona.Persona");
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Zoe", "Gutierrez");
        System.out.println(objeto1.toString());
        System.out.println("Variable estatica despues del objeto " + Persona.contadorPersonas);
        var objeto2 = new Persona("Nathalia", "Gutierrez");
        System.out.println(objeto1.toString());
        System.out.println("Variable estatica despues del objeto " + Persona.contadorPersonas);
    }
}
