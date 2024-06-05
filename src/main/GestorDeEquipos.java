package main;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GestorDeEquipos {

	private LinkedList<Equipo> equipos;

	public GestorDeEquipos() {
		this.equipos = new LinkedList<>();
	}

	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "GestorDeEquipos [equipos=" + equipos + "]";
	}

	// Métodos para gestionar equipos
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	public void eliminarEquipo(String nombre) {
		equipos.removeIf(equipo -> equipo.getNombre().equalsIgnoreCase(nombre));
	}

	public Equipo buscarEquipo(String nombre) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre().equalsIgnoreCase(nombre)) {
				return equipo;
			}
		}
		return null;
	}

	public int obtenerCantidadEquipos() {
		return equipos.size();
	}

	public LinkedList<Equipo> obtenerListaEquipos() {
		return equipos;
	}

	public void jugarPartido(Equipo equipo1, Equipo equipo2) {
		int golesEquipo1 = (int) (Math.random() * 5);
		int golesEquipo2 = (int) (Math.random() * 5);
		String resultado = equipo1.getNombre() + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipo2.getNombre();
		JOptionPane.showMessageDialog(null,
				"Simulando partido entre " + equipo1.getNombre() + " y " + equipo2.getNombre() + "\n" + resultado);
	}

	// Métodos movidos de la clase Main
	public void agregarJugadorAGestor() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador:");
			String posicion = JOptionPane.showInputDialog("Ingrese la posición del jugador:");
			int numeroCamiseta = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el número de camiseta del jugador:"));
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del jugador:"));
			Jugador jugador = new Jugador(nombre, posicion, numeroCamiseta, edad);
			equipo.AgregarJugador(jugador);
			JOptionPane.showMessageDialog(null, "Jugador agregado al equipo " + nombreEquipo);
		} else {
			JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
		}
	}

	public void eliminarJugadorDeEquipo() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador a eliminar:");
			equipo.EliminarJugador(nombreJugador);
			JOptionPane.showMessageDialog(null, "Jugador eliminado del equipo " + nombreEquipo);
		} else {
			JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
		}
	}

	public void buscarJugadorEnEquipo() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador a buscar:");
			Jugador jugador = equipo.buscarJugador(nombreJugador);
			if (jugador != null) {
				JOptionPane.showMessageDialog(null, "Jugador encontrado: " + jugador);
			} else {
				JOptionPane.showMessageDialog(null, "Jugador no encontrado en el equipo " + nombreEquipo);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
		}
	}

	public void agregarEquipoAGestor() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
		String ciudadEquipo = JOptionPane.showInputDialog("Ingrese la ciudad del equipo:");
		Equipo equipo = new Equipo(nombreEquipo, ciudadEquipo, null);
		agregarEquipo(equipo);
		JOptionPane.showMessageDialog(null, "Equipo agregado: " + nombreEquipo);
	}

	public void eliminarEquipoDelGestor() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a eliminar:");
		eliminarEquipo(nombreEquipo);
		JOptionPane.showMessageDialog(null, "Equipo eliminado: " + nombreEquipo);
	}

	public void buscarEquipoEnGestor() {
		String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar:");
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			JOptionPane.showMessageDialog(null, "Equipo encontrado: " + equipo);
		} else {
			JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
		}
	}

	public void simularPartido() {
		String nombreEquipo1 = JOptionPane.showInputDialog("Ingrese el nombre del primer equipo:");
		Equipo equipo1 = buscarEquipo(nombreEquipo1);
		if (equipo1 == null) {
			JOptionPane.showMessageDialog(null, "Primer equipo no encontrado.");
			return;
		}

		String nombreEquipo2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo equipo:");
		Equipo equipo2 = buscarEquipo(nombreEquipo2);
		if (equipo2 == null) {
			JOptionPane.showMessageDialog(null, "Segundo equipo no encontrado.");
			return;
		}

		jugarPartido(equipo1, equipo2);
	}
}