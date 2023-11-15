package Parcial;

public class Motor {

	private boolean enciendeMotor = false;
	
	public void apagarMotor() {
		if (enciendeMotor == true) {
			enciendeMotor = false;
		}
	}
	
	public void endenderMotor() {
		
		if (enciendeMotor == false) {
			enciendeMotor = true;
		}
	}
	
	public boolean getEnciendeMotor() {
		return enciendeMotor;
	}
}
