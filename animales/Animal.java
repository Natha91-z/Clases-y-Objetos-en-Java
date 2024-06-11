package animales;

public class Animal {
    public void comer(){
        System.out.println("Como muchas veces al dia");
    }
    public void dormir(){
        System.out.println("Duermo muchas veces al dia");
    }
}// fin clase animal

// clase que hereda

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args){
        System.out.println("*** Ejemplo Herencia***");
        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("\nClase Hija, soy un perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}