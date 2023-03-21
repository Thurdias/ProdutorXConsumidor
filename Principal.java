package jantarDosSelvagens;

import javax.swing.JFrame;

public class Principal extends JFrame{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private Painel objPainel = new Painel();
	
	// M�todo principal de execu��o da classe
	public static void main(String[] args) {
		new Principal().setVisible(true);
	}

	// M�todo construtor da classe
	public Principal() {
		// Configura��o da janela
		setTitle("Jantar dos Selvagens");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configura��o do painel
		setContentPane(objPainel);
		
		// Configura��o das Threads
		ControleTela objControleTela = new ControleTela(objPainel);
		objControleTela.start();
		
		new Selvagem(1000).start();
		new Selvagem(2000).start();
		new Selvagem(3000).start();
		
		new Cozinheiro().start();
	}
}
