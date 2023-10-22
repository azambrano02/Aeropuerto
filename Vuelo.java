import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {
	private Date horaVuelo;
	protected List<Pasajero> pasajeros;
	private Avion avion;
	private Ciudad ciudadDestino;
	private Ciudad ciudadOrigen;
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public Vuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
		this.pasajeros = new ArrayList<>();
		this.pilotos = new ArrayList<>();
	}
	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		throw new UnsupportedOperationException();
	}
}