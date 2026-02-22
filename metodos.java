
import java.util.Scanner;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    // Registrar productos en la matriz
    public objProducto[][] registrarProductos(objProducto[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                objProducto p = new objProducto();

                System.out.println("\nProducto en posición [" + i + "][" + j + "]");

                System.out.print("Ingrese nombre: ");
                p.setNombre(teclado.nextLine());

                System.out.print("Ingrese cantidad: ");
                p.setCantidad(Integer.parseInt(teclado.nextLine()));

                matriz[i][j] = p;
            }
        }

        return matriz;
    }

    // Calcular inventario total
    public int calcularInventarioTotal(objProducto[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != null) {
                    suma += matriz[i][j].getCantidad();
                }
            }
        }

        return suma;
    }
}
