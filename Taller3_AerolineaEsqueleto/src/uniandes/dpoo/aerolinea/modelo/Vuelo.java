package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	// ATRIBUTOS
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquetes;
	
	// CONSTRUCTOR
	public Vuelo(String fecha, Avion avion, Ruta ruta, Map<String, Tiquete> tiquetes) {
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		this.tiquetes = tiquetes;
	}
	
	// MÉTODOS
	public String getFecha() {
		return fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return 0;
	}
	
	public boolean equals(Object obj) {
		return false;
	}
	
}
