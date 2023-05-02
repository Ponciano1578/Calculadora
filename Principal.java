import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.text.NumberFormat;


public class Principal {

	private JFrame Frm_Calculadora;
	private JTextField textField;
    private Controladora controladora;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.Frm_Calculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private EnumOperacao operacaoAtual;
	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
		controladora = new Controladora();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Frm_Calculadora = new JFrame();
		Frm_Calculadora.setTitle("Calculadora");
		Frm_Calculadora.setResizable(false);
		Frm_Calculadora.setBounds(100, 100, 300, 435);
		Frm_Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frm_Calculadora.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 36));
		textField.setBounds(20, 27, 248, 55);
		Frm_Calculadora.getContentPane().add(textField);
		textField.setColumns(10);
		
			
		
		JButton btn_AC = new JButton("AC");
		btn_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  textField.setText("");
			}
		});
		btn_AC.setBounds(20, 93, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_AC);
		
		JButton btn_porcentagem = new JButton("%");
		btn_porcentagem.setBounds(86, 93, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_porcentagem);
		
		JButton btn_Dividir = new JButton("/");
		btn_Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacaoAtual = EnumOperacao.Divisao;
		        try {
		            double valor = Double.parseDouble(textField.getText());
		            controladora.realizarOperacao(operacaoAtual, valor);
		            textField.setText("");
		        } catch (NumberFormatException ex) {
		            textField.setText("Erro");
		        }
		    }   
		});
		btn_Dividir.setBounds(152, 93, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_Dividir);
		
		JButton btn_nun7 = new JButton("7");
		btn_nun7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "7";
		        textField.setText(novoTexto);
			}
		});
		btn_nun7.setBounds(20, 154, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun7);
		
		JButton btn_nun8 = new JButton("8");
		btn_nun8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "8";
		        textField.setText(novoTexto);
			}
		});
		btn_nun8.setBounds(86, 154, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun8);
		
		JButton btn_nun9 = new JButton("9");
		btn_nun9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "9";
		        textField.setText(novoTexto);
			}
		});
		btn_nun9.setBounds(152, 154, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun9);
		
		JButton btn_nun4 = new JButton("4");
		btn_nun4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "4";
		        textField.setText(novoTexto);
			}
		});
		btn_nun4.setBounds(20, 215, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun4);
		
		JButton btn_nun5 = new JButton("5");
		btn_nun5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "5";
		        textField.setText(novoTexto);
			}
		});
		btn_nun5.setBounds(86, 215, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun5);
		
		JButton btn_nun6 = new JButton("6");
		btn_nun6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "6";
		        textField.setText(novoTexto);
			}
		});
		btn_nun6.setBounds(152, 215, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun6);
		
		JButton btn_nun1 = new JButton("1");
		btn_nun1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "1";
		        textField.setText(novoTexto);
			}
		});
		btn_nun1.setBounds(20, 276, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun1);
		
		JButton btn_nun2 = new JButton("2");
		btn_nun2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "2";
		        textField.setText(novoTexto);
			}
		});
		btn_nun2.setBounds(86, 276, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun2);
		
		JButton btn_nun3 = new JButton("3");
		btn_nun3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "3";
		        textField.setText(novoTexto);
			}
		});
		btn_nun3.setBounds(152, 276, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun3);
		
		
		
		JButton btn_nun0 = new JButton("0");
		btn_nun0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String textoAtual = textField.getText();
		        String novoTexto = textoAtual + "0";
		        textField.setText(novoTexto);
			
			}
		});
		btn_nun0.setBounds(20, 337, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_nun0);
		
		JButton btn_multiplicacao = new JButton("X");
		btn_multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacaoAtual = EnumOperacao.Multiplicacao;
		        try {
		            double valor = Double.parseDouble(textField.getText());
		            controladora.realizarOperacao(operacaoAtual, valor);
		            textField.setText("");
		        } catch (NumberFormatException ex) {
		            textField.setText("Erro");
		        }
		    }   
		});

		btn_multiplicacao.setBounds(218, 93, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_multiplicacao);
		
		JButton btn_subitracao = new JButton("-");
		btn_subitracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacaoAtual = EnumOperacao.Subtracao;
		        try {
		            double valor = Double.parseDouble(textField.getText());
		            controladora.realizarOperacao(operacaoAtual, valor);
		            textField.setText("");
		        } catch (NumberFormatException ex) {
		            textField.setText("Erro");
		        }
		    }   
		});
		btn_subitracao.setBounds(218, 154, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_subitracao);
		
		JButton btn_mais = new JButton("+");
		btn_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 operacaoAtual = EnumOperacao.Soma;
			        try {
			            double valor = Double.parseDouble(textField.getText());
			            controladora.realizarOperacao(operacaoAtual, valor);
			            textField.setText("");
			        } catch (NumberFormatException ex) {
			            textField.setText("Erro");
			        }
			    }   
			});
		btn_mais.setBounds(218, 215, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_mais);
		
		JButton btn_Resultado = new JButton("=");
		btn_Resultado.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			        try {
			            double valor = Double.parseDouble(textField.getText());
			            double resultado = controladora.realizarOperacao(operacaoAtual, valor);
			            NumberFormat formatador = NumberFormat.getNumberInstance();
			            formatador.setMaximumFractionDigits(2);
			            textField.setText(formatador.format(resultado));
			            operacaoAtual = null;
			        } catch (NumberFormatException ex) {
			            textField.setText("Erro");
			        }
			    }
			});
		btn_Resultado.setBounds(218, 276, 50, 111);
		Frm_Calculadora.getContentPane().add(btn_Resultado);
		
		JButton btn_Apagar = new JButton("<");
		btn_Apagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textoAtual = textField.getText();
				if (textoAtual.length() > 0) {
				String novoTexto = textoAtual.substring(0, textoAtual.length() - 1);
				textField.setText(novoTexto);
			}
		  }
		});
		btn_Apagar.setBounds(152, 337, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_Apagar);
		
		JButton btn_virgula = new JButton(",");
		btn_virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoAtual = textField.getText();
			      if (!textoAtual.contains(",")) {
			          String novoTexto = textoAtual + ",";
			          textField.setText(novoTexto);
		     }    
		   }
		});
		btn_virgula.setBounds(86, 337, 50, 50);
		Frm_Calculadora.getContentPane().add(btn_virgula);
	

		
	
	}
}
