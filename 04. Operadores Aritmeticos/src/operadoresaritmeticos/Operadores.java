package operadoresaritmeticos;

public class Operadores {
    public static void main(String[] args) {
        //Aritmeticos
        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero1 + numero2;

        System.out.println(resultado);
        /*
        * Comparación
        * */

        System.out.println(numero1 > numero2); //false
        numero1 = 50;
        System.out.println(numero1 > numero2); //true
        numero2 = 50;
        boolean resultado1 = numero1 <= numero2;
        System.out.println(resultado1); //true

        /*
         * Lógicos
         * */
        boolean resultado3 = numero1 > numero2 && numero1<60; //false
        System.out.println(resultado3);
    }
}
