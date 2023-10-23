import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {
	private Date horaVuelo;

	protected Date fechaVuelo;
	protected List<Pasajero> pasajeros;
	private Avion avion;
	private Ciudad ciudadDestino;
	private Ciudad ciudadOrigen;
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public Vuelo (Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}
	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	public List<Pasajero> getPasajeros(){
		return pasajeros;
	}
}