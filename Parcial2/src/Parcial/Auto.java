package Parcial;

public class Auto extends Terrestre {
	private Motor miMotor;
	private Odometro miOdometro;
	private TanqueCombustible miTanque;
	
	public Auto (int capacidad) {
		this.miMotor = new Motor();
		this.miOdometro = new Odometro();
		this.miTanque = new TanqueCombustible(capacidad);
	}
	
	public void arrancarAuto() {
		
	}
	
	public void apagarAuto() {
		
	}
	
	public void avanzarAuto() {
		
	}
}
