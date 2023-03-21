package jantarDosSelvagens;

public class Selvagem extends Thread{
	// Propriedades da classe
	private int tempoDeComer = 0;
	
	// M�todo construtor cheio da classe
	public Selvagem(int tempoDeComer) {
		this.tempoDeComer = tempoDeComer;
	}
	
	// M�todo de execu��o paralela da classe
	public void run() {
		while(true) {
			if(AreaDeMemoriaCompartilhada.getQtdPorcoesCaldeirao() > 0) {
				AreaDeMemoriaCompartilhada.jantar();
			}
			
			try {sleep(tempoDeComer);} catch (Exception erro){}
		}
	}

}
