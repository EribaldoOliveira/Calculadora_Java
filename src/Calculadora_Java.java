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
						System.out.println("\n************************************************");
						System.out.println("                     RESPOSTA");
						System.out.println("************************************************\n");
						System.out.printf("              RESULTADO DE: %d + %d = %d", numero1, numero2, resultado);
						
						//System.out.printf("%d + %d = %d", numero1, numero2, resultado);
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
						System.out.printf("              RESULTADO DE: %d / %d = %d", numero1, numero2, resultado);
					
						

						
						
						resultado = JOptionPane.showConfirmDialog(null, " Deseja continuar? ");
						
						if (resultado == JOptionPane.YES_OPTION) {
							
							break;
						}
							
						else if (resultado == JOptionPane.NO_OPTION) {  
							
							JOptionPane.showMessageDialog(null, " OK! Operação concluida! ");
							
						}
							
						else if (resultado == JOptionPane.CANCEL_OPTION) {  
								
							JOptionPane.showMessageDialog(null, " OK! Até Breve! ");
							
							
							
						 } else {
							// JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
												
						
						break;
						
					}
					
					//Outro Caso
					/*default: {
						
						JOptionPane.showMessageDialog(null, " Opcao Invalida! ");
						System.out.println("Opcao Invalida!");
						*/
						
					}
				
				}
				
			}

		}
