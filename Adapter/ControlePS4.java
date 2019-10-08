package Adapter;

public class ControlePS4 {
	
	private SensorPS4 sensorAqueSeConecta;
	
	public void Conectar(SensorPS4 sensor) {
		this.sensorAqueSeConecta = sensor;
		sensorAqueSeConecta.conectarPS4();
	}

}
