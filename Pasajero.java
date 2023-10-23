import java.util.Date;

public class Pasajero extends Vuelo {
	private String run;
	private Date fechaVuelo;
	private PasaporteSanitario pasaporteSanitario;

	public Pasajero(Date fechaVuelo) {
		super(fechaVuelo);
	}

	public String getRun() {
		return this.run;
	}
	public Date getFechaVuelo(){
		return this.fechaVuelo;
	}
	public PasaporteSanitario getPasaporteSanitario() {
		return pasaporteSanitario;
	}
}