package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PedidoTest {
	private Pedido pedido1, pedido2, pedido3;
	private ProductoMenu productoMenu1, productoMenu2;
	
	@BeforeAll
	void setUp() throws Exception {
		
		pedido1 = new Pedido("John Doe", "45th Wall Street");
		pedido2 = new Pedido("Mun-Dee", "2 Saggers Road");
		pedido3 = new Pedido("Tavish Finnegan DeGroot", "23 Corrennie Gardens");
		
		productoMenu1 = new ProductoMenu("corral", 14000);
		productoMenu2 = new ProductoMenu("papas grandes", 6900);
		
		pedido1.agregarProducto(productoMenu1);
		pedido1.agregarProducto(productoMenu2);
	}
	
	@AfterAll
	void tearDown() throws Exception {}
	
	@Test
	void testGetIDPedido() {
		assertEquals(1, pedido1.getIdPedido(), "El ID del 1er pedido no es el esperado.");
		assertEquals(2, pedido2.getIdPedido(), "El ID del 2do pedido no es el esperado.");
		assertEquals(3, pedido3.getIdPedido(), "El ID del 3er pedido no es el esperado.");
	}
	
	@Test
	void testGetnombreCliente() {
		assertEquals("John Doe", pedido1.getNombreCliente(), "El nombre del cliente no es el esperado.");
	}
		
	
	@Test
	void testGetPrecioTotalPedido() {
		assertEquals(24871, pedido1.getPrecioTotalPedido(), "El total del pedido no es el esperado.");
	}
	
	@Test
	void testGenerarTextoFactura() throws Exception {
			assertEquals(
				"Cliente: John Doe\n"
				+ "Dirección: 45th Wall Street\n"
				+ "----------------\n"
				+ "corral\n"
				+ "            14000\n"
				+ "papas grandes\n"
				+ "            6900\n"
				+ "----------------\n"
				+ "Precio Neto:  20900\n"
				+ "IVA:          3971\n"
				+ "Precio Total: 24871\n"
				, pedido1.generarTextoFactura(), "La factura generada no fue la esperada."); 
		}
}
