import java.util.Scanner;

class Main {

    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();

        System.out.println("Ingrese la cantidad de productos:");
        int cantidad = sc.nextInt();

        double total = calcularTotal(precio, cantidad);

        System.out.println("El total de la compra es: " + total);
    }
}