package cl.dmiranda;
import java.util.Scanner;

public class Menu {
	
	public void menu(ProductoServicio productoServicio, ExportadorTxt exportadorTxt) {
	Scanner scanner = new Scanner(System.in);
	Utilidad utilidad = new Utilidad();
	
    int opcion;
    
    do {
        
        System.out.println("Menú:");
        System.out.println("1. Listar Producto");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Exportar Datos");
        System.out.println("4. Salir");
        System.out.println("5. Limpiar pantalla");
        System.out.print("Seleccione una opción: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                utilidad.tiempoEspera("Listando productos", 100);
                productoServicio.listarProductos();
                break;
            case 2:
            	scanner.nextLine();
                System.out.println("Ingrese el articulo: ");
                String articulo = scanner.nextLine();
                System.out.println("Ingrese el precio: ");
                String precio = scanner.nextLine();
                System.out.println("Ingrese la descripción: ");
                String descripcion = scanner.nextLine();
                System.out.println("Ingrese el codigo: ");
                String codigo = scanner.nextLine();
                System.out.println("Ingrese la talla: ");
                String talla = scanner.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = scanner.nextLine();
                System.out.println("Ingrese el color: ");
                String color = scanner.nextLine();
                utilidad.tiempoEspera("Agregando producto", 100);
                Producto producto = new Producto (articulo, precio, descripcion, codigo, talla, marca, color);
                productoServicio.agregarProductos(producto);
                break;
            case 3:
            	utilidad.tiempoEspera("Exportando productos", 100);
                exportadorTxt.exportar(productoServicio.getListaProductos());
                break;
            case 4:
            	utilidad.tiempoEspera("Saliendo", 100);
                break;
            case 5:
            	utilidad.limpiezaPantalla();
            	break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }

        System.out.println();
    } while (opcion != 4);

    scanner.close();
	}
}
