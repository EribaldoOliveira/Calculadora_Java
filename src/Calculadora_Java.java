import javax.swing.JOptionPane;

public class Calculadora_Java {
	
	public static void main(String[] args) {
				
				int numero1, numero2, resultado;
				int opcao;
				
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma das opções a seguir: \n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao\n", "Leia com atencao!", JOptionPane.QUESTION_MESSAGE));
				
				numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));

				numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: ", "Exercicio Java", JOptionPane.QUESTION_MESSAGE));
				
				//switch = Selecione
				switch(opcao) {
				
					//Case - Caso
					case 1: {
						
						//1 - Adicao
						resultado = numero1 + numero2;
						//System.out.printf("%d + %d = %d", numero1, numero2, resultado);
						
						System.out.println("\n************************************************");
						System.out.println("                     RESPOSTA");
						System.out.println("************************************************\n");
						System.out.printf("              RESULTADO DE: %d + %d = %d", numero1, numero2, resultado);
						
						

						//Interrompe
						break;
						
					}
					
					case 2: {
						
						//2 – Subtração
						resultado = numero1 - numero2;
						
						System.out.println("\n************************************************");
						System.out.println("                     RESPOSTA");
						System.out.println("************************************************\n");
						System.out.printf("              RESULTADO DE: %d - %d = %d", numero1, numero2, resultado);
						
						break;
						
					}
					
					case 3: {
						
						//3 – Multiplicação
						resultado = numero1 * numero2;
						
						System.out.println("\n************************************************");
						System.out.println("                     RESPOSTA");
						System.out.println("************************************************\n");
						System.out.printf("              RESULTADO DE: %d * %d = %d", numero1, numero2, resultado);
						
						break;
						
					}
					
					case 4: {
						
						//4 – Divisão
						resultado = numero1 / numero2;

						System.out.println("\n************************************************");
						System.out.println("                     RESPOSTA");
						System.out.println("************************************************\n");
						System.out.printf("              RESULTADO DE: %d + %d = %d", numero1, numero2, resultado);
						
						break;
						
					}
					
					//Outro Caso
					default: {
						
						System.out.println("Opcao Invalida!");
						
					}
				
				}
				
			}

		}
