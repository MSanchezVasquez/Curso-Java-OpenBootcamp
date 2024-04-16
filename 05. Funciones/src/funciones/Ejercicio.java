package funciones;
/*
Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Ejercicio {
    public static void main(String[] args) {
        double precioConImpuestos = precioConIVA(15);
        System.out.println(precioConImpuestos);
    }

    static double precioConIVA(double precio){
        System.out.print("El precio con impuestos es: ");
        return (precio*0.5)+precio;
    }
}
