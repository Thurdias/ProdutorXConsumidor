package jantarDosSelvagens;

public class Cozinheiro extends Thread{
	// M�todo de execu��o paralela da classe
	public void run() {
		while(true) {
		if(AreaDeMemoriaCompartilhada.getQtdPorcoesCaldeirao() <= 0) {
			AreaDeMemoriaCompartilhada.cozinhar();
		}
		try {sleep(2000);} catch (Exception erro) {}
		}
	}
}
