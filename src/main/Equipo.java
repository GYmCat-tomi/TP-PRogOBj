package main;

import java.util.LinkedList;

public class Equipo {

	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores;

	public Equipo(String nombre, String ciudad, LinkedList<Jugador> jugadores) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.jugadores = jugadores;
		if (this.jugadores == null) {
			this.jugadores = new LinkedList<>();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	// metodo para agregar jugador
	public void AgregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	// metodo para eliminarlo
	public void EliminarJugador(String nombre) {
		jugadores.removeIf(jugador -> jugador.getNombre().equalsIgnoreCase(nombre));
	}

	// buscar jugador
	public Jugador buscarJugador(String nombre) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombre)) {
				return jugador;
			}
		}
		return null;
	}

	public int obtenerCantidadJugadores() {
		return jugadores.size();
	}

	public LinkedList<Jugador> obtenerListaJugadores() {
		return jugadores;
	}

	@Override
	public String toString() {
		return "Equipo{" + "nombre='" + nombre + '\'' + ", ciudad='" + ciudad + '\'' + ", jugadores=" + jugadores + '}';
	}

}
