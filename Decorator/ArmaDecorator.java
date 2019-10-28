package Decorator;

public class ArmaDecorator implements Arma{

	  public Arma arma;

	  public ArmaDecorator(Arma arma){
	    this.arma = arma;
	  }

	  public void montar(){
	    this.arma.montar();
	  }

}
