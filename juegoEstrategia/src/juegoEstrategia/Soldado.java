package juegoEstrategia;

public class Soldado extends Personaje implements Bebible{
	private static final int distanciaAtaque=1;
	private int energia;
	
	public Soldado(Punto posicion) {
		super(posicion,200,10);
		this.energia=100;
	
	}

	@Override
	public void atacar(Personaje otroPersonaje) {
	if(puedeAtacar(otroPersonaje)) {
		otroPersonaje.recibirAtaque(this);
		this.energia-=10;
		
	}
	else System.out.println("no puede atacar, no tiene energia, tome pocion");
		
	}

	@Override
	public void recibirAtaque(Personaje otroPersonaje) {
		this.setSalud(this.getSalud()-otroPersonaje.getDanio());
		
	}

	@Override
	public boolean puedeAtacar(Personaje otroPersonaje) {
		return (this.estaVivo()&&this.distancia(otroPersonaje)==this.distanciaAtaque&&this.energia>0);
		
	}

	@Override
	public void tomarPocion() {
		this.energia=100;
		
	}

}
