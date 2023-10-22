import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aeropuerto extends Vuelo {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Aeropuerto(Date horaVuelo) {
		super(horaVuelo);
	}

	public Avion agregarAviones(String nombre, int año) {
		throw new UnsupportedOperationException();
	}

	public void visualizarAviones(Avion avion) {
		throw new UnsupportedOperationException();
	}

	public List<Avion> getAviones() {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosFecha(Date fechaVuelo) {
		List<Pasajero> pasajerosFecha = new ArrayList<Pasajero>();
		for (Pasajero pasajero : this.pasajeros) {
			if (pasajero.getFechaVuelo().equals(fechaVuelo))
				pasajerosFecha.add(pasajero);
		}
		return pasajerosFecha;
	}
}