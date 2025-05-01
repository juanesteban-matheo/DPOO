package uniandes.dpoo.hamburguesas.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Ingrediente;
import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoAjustadoTest {
	private ProductoAjustado productoAjustado;
	private Ingrediente ingrediente1, ingrediente2;
	
	@BeforeEach
	void setUp() throws Exception {
		ProductoMenu productoBase = new ProductoMenu("corral", 14000);
		ingrediente1 = new Ingrediente("tocineta express", 2500);
		ingrediente2 = new Ingrediente("lechuga", 1000);
		
		productoAjustado = new ProductoAjustado(productoBase);
		productoAjustado.añadirIngrediente(ingrediente1);
		productoAjustado.quitarIngrediente(ingrediente2);
	}
	
	@AfterEach
	void tearDown() throws Exception {}
	
	@Test
    void testGetNombre() {
        assertEquals( "corral", productoAjustado.getNombre( ), "El nombre del producto no es el esperado." );
    }
	
	@Test
    void testGetPrecio() {
        assertEquals( 17500, productoAjustado.getPrecio( ), "El precio del producto no es el esperado." );
    }
}
