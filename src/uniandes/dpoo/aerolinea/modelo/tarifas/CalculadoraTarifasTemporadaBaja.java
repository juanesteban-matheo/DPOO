package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	
	// ATRIBUTOS
	protected final int COSTO_POR_KM_NATURAL = 600;
	protected final int COSTO_POR_KM_CORPORATIVO = 900;
	protected final double DESCUENTO_PEQ = 0.02;
	protected final double DESCUENTO_MEDIANAS = 0.1;
	protected final double DESCUENTO_GRANDES = 0.2;
	
	// MÉTODOS
	@Override
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int calcularDistanciaVuelo(Ruta ruta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int calcularValorImpuestos(int costoBase) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
