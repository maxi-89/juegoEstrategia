package juegoEstrategia;

public class Lancero extends Personaje{
	private static final int distanciaMinimaDeAtaque=1;
	private static final int distanciaMaximaDeAtaque=3;
	
	public Lancero(Punto posicion) {
		super(posicion,150,25);
		
	}

	@Override
	public void atacar(Personaje otroPersonaje) {
		if(puedeAtacar(otroPersonaje)) {
			otroPersonaje.recibirAtaque(this);
		}
		
	}

	@Override
	public void recibirAtaque(Personaje otroPersonaje) {
		this.setSalud(this.getSalud()-otroPersonaje.getDanio());
		
	}

	@Override
	public boolean puedeAtacar(Personaje otroPersonaje) {
		return(this.estaVivo()&&this.distancia(otroPersonaje)>=this.distanciaMinimaDeAtaque&&this.distancia(otroPersonaje)<=this.distanciaMaximaDeAtaque);
	
	}

}
