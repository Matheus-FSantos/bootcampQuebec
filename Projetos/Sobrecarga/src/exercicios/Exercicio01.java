/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class Exercicio01 {
	static Scanner leitor = new Scanner(System.in);
	
	static int area(int baseMaior) {
		System.out.print("\nInforme a lado do quadrado: ");
		baseMaior = leitor.nextInt();
		
		int resultado = baseMaior * baseMaior;
		return resultado;
	}
	
	static int area(int baseMaior, int altura) {
		System.out.print("\nInforme a base do triangulo: ");
		baseMaior = leitor.nextInt();
		System.out.print("Informe a altura do triangulo: ");
		altura = leitor.nextInt(); 
		
		int resultado = (baseMaior * altura) /2;
		return resultado;
	}
	
	static int area(int baseMaior, int baseMenor, int altura) {
		System.out.print("\nInforme a base MAIOR do quadrado: ");
		baseMaior = leitor.nextInt();
		System.out.print("Informe a base MENOR do trapézio: ");
		baseMenor = leitor.nextInt();
		
		while(baseMaior < baseMenor) {
			System.out.println("\nVoce informou numeros inválidos, insira-os novamente");
			System.out.print("Informe a base MAIOR do quadrado: ");
			baseMaior = leitor.nextInt();
			System.out.print("\nInforme a base MENOR do trapézio: ");
			baseMenor = leitor.nextInt();
		}
		
		System.out.print("Informe a altura do trapézio: ");
		altura = leitor.nextInt();
		
		int resultado = ((baseMenor + baseMaior) * altura) /2;
		return resultado;
	}
	
	public static void main(String[] args) {
		int operacao = 0;
		boolean teste = false;
		byte parametro = 0;
		
		int baseMaior = 0;
		int baseMenor= 0;
		int altura = 0;
		int total = 0;
		
		
		do {
			System.out.print("\nBem vindo a calculadora \nInforme qual área deseja calcular: 1 - Quadrado | 2 - Retângulo | 3 - Trapézio --- R: ");
			operacao = leitor.nextInt();
			while(operacao < 1 || operacao > 3){
				System.out.print("\nVocê informou uma opção inválida, informe uma valida \nOpções disponiveis: 1 - Quadrado | 2 - Retângulo | 3 - Trapézio --- R:");
				operacao = leitor.nextInt();
			}
			
			switch(operacao) {
			case 1:
				total = area(baseMaior);
				System.out.println();
				System.out.println("\nA área do quadrado é: " + total);
				break;
			case 2: 
				total = area(baseMaior, altura);
				System.out.println();
				System.out.println("\nO área do triangulo é: " + total);
				break;
			case 3:
				total = area(baseMaior, baseMenor, altura);
				System.out.println();
				System.out.println("\nA área do trapezio é: " + total);
				break;
			}
			
			System.out.println("\nDeseja fazer outra conta? \n1... - Sim | 0 - Não");
			parametro = leitor.nextByte();
			if(parametro != 0) {
				teste = true;
			} else {
				teste = false;
			}
		} while(teste != false);
		System.out.print("\n\n\nFim");
	}
}
