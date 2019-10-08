package Adapter;

public class AdaptadorPS4ParaXbox2 extends SensorPS4 {
	
	private SensorXbox2 adaptee;
	
	public AdaptadorPS4ParaXbox2(SensorXbox2 adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarPS4() {
		adaptee.conectarXbox2();
        System.out.println("But stadia wins!");
	}

}