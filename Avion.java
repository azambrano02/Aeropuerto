import java.util.ArrayList;

public class Avion {
	private String nombre;
	private int a�o;
	private double kmRecorridos;
	private Aeropuerto aeropueto;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�o() {
		return this.a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}