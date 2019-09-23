package juegoEstrategia;

public class Punto {
	private double x;
	private double y;
//declaracion de constructores
		public Punto (Punto z){
		
		this.setX(x);
		this.setY(y);
	}
	
		public Punto (double p1, double p2){
		this.setX(p1);
		this.setY(p2);
	}

		public Punto (double z){
		this.setX(z);
	}
		public Punto(){
		this(0,0);
		
	}

	//getters and Setters
		
		public double getX() {
		return x;
	}



		public void setX(double x) {
		this.x = x;
	}



		public double getY() {
		return y;
	}



		public void setY(double y) {
		this.y = y;
	}


@Override
		public String toString() {
			return "Punto [x=" + x + ", y=" + y + "]";
		}
//METODO QUE MARCA LA DISTANCIA ENTRE DOS PUNTOS
		public double distancia(Punto z){
			
			double distancia;
			return distancia=Math.hypot(this.getX()-z.getX(), this.getY()-z.getY());
		}
		public static double distancia(Punto z, Punto h){
			double c1=z.getX()-h.getX();
			double c2=z.getY()-h.getY();
			
			return Math.hypot(c1,c2);
		}
		

}
