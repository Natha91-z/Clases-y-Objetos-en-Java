public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " +resultado);

    }
    void restar(){
        int resultado = operando1 -operando2;
        System.out.println("Resultado Resta: " +resultado);
    }
    public static void main(String[] args){
        System.out.println("*** Ejemplo Aritmetico***");
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1=5;
        aritmetica1.operando2=7;
        aritmetica1.sumar();

        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1=19;
        aritmetica2.operando2=7;
        aritmetica2.restar();
    }
}
