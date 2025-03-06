package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente {
	
	// ATRIBUTOS
	public static String NATURAL = "Natural";
	private String nombre;
	
	// CONSTRUCTOR
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getTipoCliente() {
		return ClienteNatural.NATURAL;
	}

	@Override
	public String getIdentificador() {
		return null;
	}

	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcularValorTotalTiquete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
	
}
