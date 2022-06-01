package Observer;

import java.util.Observer;

public class Aplicacao {
	public static void main(String[] args) {
		
		//Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		carroRoubado.addObserver((Observer) carroPolicia);
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.para();
		
	}
}
