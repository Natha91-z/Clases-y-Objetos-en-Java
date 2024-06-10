public class Aritmetica {
    int operando1;
    int operando2;

    // Constructor
    public  Aritmetica(int op1, int op2){
        operando1 =op1;
        operando2 =op2;
    }

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
        var aritmetica1 = new Aritmetica(5,7);
//        aritmetica1.operando1=5;
//        aritmetica1.operando2=7;
        aritmetica1.sumar();
        aritmetica1.restar();
    }
}
