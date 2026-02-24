
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Cuantas filas tendrá la matriz?");
        int filas = Integer.parseInt(teclado.nextLine());

        System.out.println("Cuantas columnas tendrá la matriz?");
        int columnas = Integer.parseInt(teclado.nextLine());

        objProducto[][] matriz = new objProducto[filas][columnas];

        // Registrar productos
        matriz = m.registrarProductos(matriz);

        // Calcular inventario total
        int total = m.calcularInventarioTotal(matriz);

        System.out.println("\nEl inventario total de la tienda es: " + total);
    }
}
