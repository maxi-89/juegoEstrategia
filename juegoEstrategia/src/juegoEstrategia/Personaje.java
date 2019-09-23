package juegoEstrategia;

public abstract class Personaje {
	private Punto posicion;
	private int salud;
	private int danio;
	
public Personaje(Punto posicion, int salud, int danio) {
		
		this.posicion = posicion;
		this.salud = salud;
		this.danio = danio;
	}
public Personaje () {
	
	
}


protected int getDanio() {
	return danio;
}



protected int getSalud() {
	return salud;
}
protected void setSalud(int salud) {
	this.salud = salud;
}
public abstract boolean puedeAtacar(Personaje otroPersonaje);
public abstract void atacar(Personaje otroPersonaje);
public abstract void recibirAtaque(Personaje otroPersonaje);
public boolean estaVivo() {
	return(this.salud>0);
}
public void desplazar(Punto nuevaPosicion) {
	this.posicion=nuevaPosicion;
	
}
public double distancia(Personaje otroPersonaje) {
	
	return this.posicion.distancia(otroPersonaje.posicion );
}
@Override
public String toString() {
	return "Personaje [posicion=" + posicion + ", salud=" + salud + ", danio=" + danio + ", estaVivo()=" + estaVivo()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
