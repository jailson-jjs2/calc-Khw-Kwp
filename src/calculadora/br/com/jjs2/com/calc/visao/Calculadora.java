package calculadora.br.com.jjs2.com.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {

		organizarLayout();

		setSize(232, 322); // TAMANHO DA TELA
		setLocationRelativeTo(null); // ABRE NO CENTRO
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // FINALIZA TELA ATUAL, EXIT ON CLOSE FECHA TUDO
		setVisible(true); // CRIA TELA

	}

	private void organizarLayout() {
		setLayout(new BorderLayout());

		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60)); // LARGURA E ALTURA
		add(display, BorderLayout.NORTH); // LOCAL PARA COLCOAR DO DISPLAY COLORIDO

		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();

	}
}
