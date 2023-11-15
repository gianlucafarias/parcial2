package Parcial;

public class TanqueCombustible {
	private int capacidadTanque;
	private double cantidadCombustibleTanque = 0;
	
	public TanqueCombustible(int capacidad) {
		this.capacidadTanque = capacidad;
	}
	
	public void setCantidadCombustibleTanque(int cantidad) {
		this.cantidadCombustibleTanque = cantidad;
	}
	
	public double getCantidadCombustibleTanque() {
		return cantidadCombustibleTanque;
	}
	
	public void agregarCombustible(double cantidad) {
		if (cantidad <= 0) {
			System.out.println("Se debe ingresar una cantidad positiva");
		}
		else if (cantidad + cantidadCombustibleTanque >= capacidadTanque) {
			System.out.println("Tanque lleno!");
		}
		else
		this.cantidadCombustibleTanque = cantidad;
	}
}
