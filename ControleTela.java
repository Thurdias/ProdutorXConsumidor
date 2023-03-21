package jantarDosSelvagens;

public class ControleTela extends Thread{
	// Propriedades da classe
	private Painel objPainel = null;

	// Construtor cheio da classe
	public ControleTela(Painel objPainel) {
		super();
		this.objPainel = objPainel;
	}
	
	// M�todo de execu��o paralela da Thread
	public void run() {
		while(true) {
		objPainel.repaint();
		try {sleep(100);} catch(Exception erro) {}
		}
	}
}
