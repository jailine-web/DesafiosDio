import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double soma;
		boolean triangulo = ehTriangulo(A, B ,C);
		
		//TODO: Implemente a condi��o necess�ria para o c�lculo do tri�ngulo:
		//Dica: Voc� pode utilizar o String.format() na formata��o do texto.
	
		if(triangulo) {
			soma = A + B + C;
			System.out.println("Perimetro = "+soma);
		}
		else {
			soma = ((A + B) * C)/2;
			System.out.println("Area "+soma);
		}
	}
	
	public static boolean ehTriangulo(double A, double B, double C) {
		
		boolean triangulo = false;
		if(A + B > C && B + C > A && A + C > B) 
			triangulo = true;
		return triangulo;
		
	}
}
