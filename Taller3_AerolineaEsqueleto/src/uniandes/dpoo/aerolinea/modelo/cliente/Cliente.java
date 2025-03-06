package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	// ATRIBUTOS
	ArrayList<Tiquete> tiquetesUsados, tiquetesSinUSar;
	
	// CONSTRUCTOR
	public Cliente() {}
	
	// MÉTDODOS
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public abstract void agregarTiquete(Tiquete tiquete);
	
	public abstract int calcularValorTotalTiquete();
	
	public abstract void usarTiquetes(Vuelo vuelo);
}
