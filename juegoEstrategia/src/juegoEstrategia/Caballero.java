package juegoEstrategia;

public class Caballero extends Personaje implements Bebible{
private static final int distanciaMinimaDeAtaque=1;
private static final int distanciaMaximaDeAtaque=2;
private int contAtaque=0;
	
public Caballero(Punto posicion) {
	super(posicion,200,50);
	
	
}
	@Override
	public void atacar(Personaje otroPersonaje) {
		if(puedeAtacar(otroPersonaje)) {
			otroPersonaje.recibirAtaque(this);
			contAtaque++;
					
		}
		else System.out.println("Caballo rebelde, tome posion");
		
	}

	@Override
	public void recibirAtaque(Personaje otroPersonaje) {
		this.setSalud(this.getSalud()-otroPersonaje.getDanio());
		
	}

	@Override
	public boolean puedeAtacar(Personaje otroPersonaje) {
		return (this.estaVivo() && this.distancia(otroPersonaje)>=this.distanciaMinimaDeAtaque&&this.distancia(otroPersonaje)<=this.distanciaMaximaDeAtaque&&this.contAtaque<=3);
	}
	@Override
	public void tomarPocion() {
		this.contAtaque=0;
		
	}

}
