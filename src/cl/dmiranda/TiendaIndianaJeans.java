package cl.dmiranda;

public class TiendaIndianaJeans {

	public static void main(String[] args) {
		Producto primero =  new Producto("jeans", "6000", "1era categoria", "111", "6", "pillin", "verde");
		Producto segundo =  new Producto("polera", "1000", "polera verano", "222", "10", "porky", "azul");
		
		ProductoServicio servicio = new ProductoServicio();
		servicio.agregarProductos(primero);
		servicio.agregarProductos(segundo);
		Menu menu = new Menu();
		
		
		ExportadorTxt exportador = new ExportadorTxt();
		exportador.exportar(servicio.getListaProductos());
		menu.menu(servicio, exportador);

	}

}
