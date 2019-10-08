package Adapter;

public class AdaptadorNintendo64ParaPS4 extends SensorNintendo64 {
	
	SensorPS4 adapt = new SensorPS4();
	
	public AdaptadorNintendo64ParaPS4(SensorPS4 adapt) {
		this.adapt = adapt;
	}
	
	public void conectarNintendo64() {
		adapt.conectarPS4();
		System.out.println("Pula marinho");
	}
	
}


