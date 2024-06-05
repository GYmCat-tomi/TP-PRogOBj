package main;

public class Jugador {

	private String nombre;
	private String posicion;
	private int NumeroCamiseta;
	private int edad;

	public Jugador(String nombre, String posicion, int numeroCamiseta, int edad) {
		this.nombre = nombre;
		this.posicion = posicion;
		NumeroCamiseta = numeroCamiseta;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumeroCamiseta() {
		return NumeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		NumeroCamiseta = numeroCamiseta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", NumeroCamiseta=" + NumeroCamiseta + ", edad="
				+ edad + "]";
	}

}
