package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import uniandes.dpoo.hamburguesas.excepciones.HamburguesaException;
import uniandes.dpoo.hamburguesas.excepciones.NoHayPedidoEnCursoException;
import uniandes.dpoo.hamburguesas.excepciones.YaHayUnPedidoEnCursoException;
import uniandes.dpoo.hamburguesas.mundo.Ingrediente;
import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;

@TestInstance(Lifecycle.PER_CLASS)
public class RestauranteTest {
	
	private static File combos = new File("data/combos.txt");
	private static File ingredientes = new File("data/ingredientes.txt");
	private static File menu = new File("data/menu.txt");
	
	String nombre, direccion;
	private Restaurante restaurante;
	private Pedido pedido;
	private ProductoMenu productoMenu1, productoMenu2;
	private ProductoAjustado productoAjustado;
	private Ingrediente ingrediente1, ingrediente2;
	
	@BeforeAll
	void setUp() throws Exception {
		restaurante = new Restaurante();
		
		nombre = "John Doe";
		direccion = "45th Wall Street";
		pedido = new Pedido(nombre, direccion);
		
		productoMenu1 = new ProductoMenu("corral", 14000);
		productoMenu2 = new ProductoMenu("papas grandes", 6900);
		
		ingrediente1 = new Ingrediente("tocineta express", 2500);
		ingrediente2 = new Ingrediente("queso fundido", 4500);
		
		productoAjustado = new ProductoAjustado(productoMenu1);
		productoAjustado.añadirIngrediente(ingrediente1);
		productoAjustado.quitarIngrediente(ingrediente2);
		
		pedido.agregarProducto(productoAjustado);
		pedido.agregarProducto(productoMenu2);
		
	}
	
	@AfterAll
	void tearDown() throws Exception {}
	
	
	@Test
	void testPedidos() {
		try {
			restaurante.iniciarPedido(pedido);
		} catch (YaHayUnPedidoEnCursoException e) {
			System.out.println("ERROR: Ya hay un pedido en curso!");
			e.printStackTrace();
		}
		assertEquals(pedido, restaurante.getPedidoEnCurso());
		try {
			restaurante.cerrarYGuardarPedido();
		} catch (NoHayPedidoEnCursoException | IOException e) {
			if (e instanceof NoHayPedidoEnCursoException) {
				System.out.println("ERROR: No hay pedido en curso!"); 
			} else {
				System.out.println("ERROR: Hubo un error guardando el archivo!");
			}
			e.printStackTrace();
		}
	}
	
	@Test
	void testCargarInformacionRestaurante() {
		try {
			restaurante.cargarInformacionRestaurante(ingredientes, menu, combos);
		} catch (NumberFormatException | HamburguesaException | IOException e) {
			if (e instanceof NumberFormatException) {
				System.out.println("ERROR: Una conversión de String a número falló por mal formateo!");
			} else if (e instanceof HamburguesaException) {
				System.out.println("ERROR: " + e.getMessage());
			} else {
				System.out.println("ERROR: Hubo un error guardando el archivo!");
			}
			e.printStackTrace();
		}
	}
}
