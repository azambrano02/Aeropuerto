import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Aeropuerto extends Vuelo {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	private List<Vuelo> vuelos;

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
	public List<Vuelo> buscarPasajerosVuelo(Date horaVuelo){
		List<Vuelo> vueloPasajeros = new ArrayList<Vuelo>();
		for(Vuelo vuelo : this.vuelos) {
			if (vuelo.getHoraVuelo().equals(horaVuelo))
				vueloPasajeros.add(vuelo);
		}
		return vueloPasajeros;
	}
	public void seguimientoVuelos(Vuelo vuelo) {
		for (Pasajero pasajero : vuelo.getPasajeros()) {
			PasaporteSanitario pasaporte = pasajero.getPasaporteSanitario();
			if (pasaporte != null) {
				if (pasaporte.getResultadoPCR()) {
					System.out.println("El pasajero de run" + pasajero.getRun() + " tiene un resultado PCR positivo.");
				} else {
					System.out.println("El pasajero de run" + pasajero.getRun() + " tiene un resultado PCR negativo.");
				}
			} else {
				System.out.println("El pasajero de run" + pasajero.getRun() + " no tiene un pasaporte sanitario.");
			}
		}
	}

	}
