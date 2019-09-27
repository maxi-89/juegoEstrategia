package juegoEstrategia;

public class TestJuego {
	
	public static void main(String[] args) {
		
		Personaje arquerito = new Arquero(new Punto(0,10));
		Personaje arquerazo = new Arquero(new Punto(0,8));
		Personaje soldadito = new Soldado(new Punto(1,9));
		Personaje soldadazo = new Soldado(new Punto(2,5));
		
		
		System.out.println(arquerazo);
		arquerito.atacar(arquerazo);
		System.out.println(arquerito);
		System.out.println(arquerazo);
		//comments
		//comments 2 prueb
		
	}

}
