import java.util.ArrayList;

public class Avion {
	private String nombre;
	private int año;
	private double kmRecorridos;
	private Aeropuerto aeropueto;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}