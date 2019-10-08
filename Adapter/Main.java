package Adapter;

public class Main {
	

	public static void main(String[] args) {
		
		SensorXbox2 adaptee = new SensorXbox2();
		ControlePS4 target = new ControlePS4();
		AdaptadorPS4ParaXbox2 adapter = new AdaptadorPS4ParaXbox2(adaptee);

		
		SensorPS4 adaptee1 = new SensorPS4();
		ControleNintendo64 target1 = new ControleNintendo64();
		AdaptadorNintendo64ParaPS4 adapter1 = new AdaptadorNintendo64ParaPS4(adaptee1);
		
		target.Conectar(adapter);
		
		target1.Conectar(adapter1);
	}

}