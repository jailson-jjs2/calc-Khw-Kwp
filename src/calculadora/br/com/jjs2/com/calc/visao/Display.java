package calculadora.br.com.jjs2.com.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calculadora.br.com.jjs2.com.calc.visao.modelo.Memoria;
import calculadora.br.com.jjs2.com.calc.visao.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this); // OBSERVADOR SER SEMPRE NOTIFICADO QUANDO MUDAR O VALOR
		
		setBackground( new Color (221, 216, 212));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout( new FlowLayout(FlowLayout.RIGHT, 10, 25)); // PARA ALINHA OS NUMEROS DO DISPLAY A DIREITA
		
		add(label);
		
	}
	
	@Override
	public void valorAlterado(String novoValor) { // NOTIFICA MUNDANÇA NA MEMORIA
		label.setText(novoValor);
		
	}

}
