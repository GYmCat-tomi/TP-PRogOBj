package main;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {

		// Crear gestor de equipos
		GestorDeEquipos gestor = new GestorDeEquipos();

		String[] opcionesMenu = { "Agregar jugador a Equipo", "Eliminar Jugador de Equipo",
				"Buscar Jugador en Equipo", "Agregar Equipo", "Eliminar Equipo", "Buscar Equipo", "Simular Partido",
				"Salir" };

		int opcion;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "MenU de GestiOn de Equipos",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

			switch (opcion) {
			case 0:
				gestor.agregarJugadorAGestor();
				break;
			case 1:
				gestor.eliminarJugadorDeEquipo();
				break;
			case 2:
				gestor.buscarJugadorEnEquipo();
				break;
			case 3:
				gestor.agregarEquipoAGestor();
				break;
			case 4:
				gestor.eliminarEquipoDelGestor();
				break;
			case 5:
				gestor.buscarEquipoEnGestor();
				break;
			case 6:
				gestor.simularPartido();
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Hasta LUego AmiGAso.");
				break;
			default:
				break;
			}
		} while (opcion != 7);
	}
}
