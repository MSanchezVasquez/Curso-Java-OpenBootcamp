package funciones;

public class Funciones {
    public static void main(String[] args) {
        // opcion 1: funcion sin parametros y sin tipo de retorno
        //showMenu();
        //showMenu();

        // opcion 2: funcion sin parametros y con tipo de retorno
        /*String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());*/
        /*double price = getPrice();
        System.out.println(price);*/

        // opcion 3: funcion con parametros y sin tipo de retorno
        /*imprimirSaludo("OpenBootcamp");
        imprimirSaludo("Moises");*/

        // opcion 4: funcion con parametros y con tipo de retorno
        String saludo = obtenerSaludo("Moises", "Sanchez");
        System.out.println(saludo);

        int resultadoSuma = suma(50,200);
        System.out.println(resultadoSuma);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static String obtenerSaludo(String name, String lastName) {
        return "Hi, nice to meet you " + name + " " + lastName;
    }

    static void imprimirSaludo(String name){
        System.out.println("Buenas tardes " + name);
    }

    static double getPrice() {
        return 100.99;
    }

    /*
    void indica que no retorna nada
     */
    static void showMenu(){
        System.out.println("Bienvenidos al E-commerce de shoes");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar Zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        System.out.println("Imprimiendo texto");
        return "Bienvenidos al E-commerce de shoes: \n 1 - Ver Zapatillas \n 2 - Comprar Zapatillas \n 3 - Salir";
    }
}
