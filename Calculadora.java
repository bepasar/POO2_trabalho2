package ExercicioCalculadora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;


public class Calculadora extends JFrame {

	private JButton[] buttons; // array de botoes
	
	private JTextField operacao;
	
	private static final String[] names = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
	
	private JPanel botoes;
	
	private Container container; // contêiner do frame

	private GridLayout organizaBotoes; 

	// construtor sem argumentos

	public Calculadora() {

		super("Calculadora");
		
		setLayout(new BorderLayout() );
		
		operacao = new JTextField ("", 15);
		add(operacao, BorderLayout.NORTH);
		
		botoes = new JPanel();
		organizaBotoes = new GridLayout(4, 4); // botoes calculadora
		botoes.setLayout(organizaBotoes);
		add(botoes);

		buttons = new JButton[names.length]; // cria array de JButtons
		
		for (int count = 0; count < names.length; count++) {

			buttons[count] = new JButton(names[count]);

			//buttons[count].addActionListener(this); // ouvinte registrado

			botoes.add(buttons[count]);// adiciona botao ao JFrame

		}
		
	}


	public static void main(String[] args) {

		Calculadora gridLayoutFrame = new Calculadora();

		gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gridLayoutFrame.setSize(250, 250);

		gridLayoutFrame.setVisible(true);

	}

}