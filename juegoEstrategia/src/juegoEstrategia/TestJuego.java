package juegoEstrategia;

public class TestJuego {
	
	public static void main(String[] args) {
		
		Personaje arquerito=new Arquero(new Punto(0,10));
		Personaje arquerazo=new Arquero(new Punto (0,8));
		
		System.out.println(arquerazo);
		arquerito.atacar(arquerazo);
		System.out.println(arquerazo);
		
	}

}
