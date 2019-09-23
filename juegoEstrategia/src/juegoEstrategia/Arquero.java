package juegoEstrategia;

public class Arquero extends Personaje{


private static final int distanciaMinimaDeAtaque=2;
private static final int distanciaMaximaDeAtaque=5;
public int flechas;

public Arquero(Punto posicion) {
	super(posicion, 50, 5);
	this.flechas = 20;
}






@Override
public String toString() {
	return "Arquero [flechas=" + flechas + ", getDanio()=" + getDanio() + ", getSalud()=" + getSalud() + "]";
}






public void recargarFlechas() {
	this.flechas+=6;
}
@Override
public void atacar(Personaje otroPersonaje) {
	if(puedeAtacar(otroPersonaje)) {
		this.flechas--;
		otroPersonaje.recibirAtaque(this);
		
	}
	
}
@Override
public void recibirAtaque(Personaje otroPersonaje) {
this.setSalud(this.getSalud()-otroPersonaje.getDanio());
	
}



@Override
public boolean  puedeAtacar(Personaje otroPersonaje) {
	
	return (this.estaVivo()&&this.flechas>0&&this.distancia(otroPersonaje)
			>=this.distanciaMinimaDeAtaque&&this.distancia(otroPersonaje)<=this.distanciaMinimaDeAtaque);
}









}
