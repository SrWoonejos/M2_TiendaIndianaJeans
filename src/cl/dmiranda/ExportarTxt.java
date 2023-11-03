package cl.dmiranda;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ExportarTxt extends Exportador {

	@Override
	public void exportar(ArrayList<Producto> listaProducto) {
		File archivo = new File("archivo.txt");
		try {
			archivo.createNewFile();
		}
		catch (Exception e) {
			System.out.println ("Error al crear archivo por;" + e);
		}
		try {
			FileWriter writer = new FileWriter (archivo);
			for (Producto producto: listaProducto) {
				writer.write(producto.toString()+ "\n");
			}
			System.out.println("El producto ha sido exportado con éxito");
			writer.close();
		}
		catch (Exception e) {
			System.out.println ("Error al escribir el archivo");
		}
		
	}

}
