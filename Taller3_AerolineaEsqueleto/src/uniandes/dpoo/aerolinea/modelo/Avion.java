package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	// ATRIBUTOS
	private String nombre;
	private int capacidad;
	
	// CONSTRUCTOR
	public Avion(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	// MÉTODOS
	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}
	

}
