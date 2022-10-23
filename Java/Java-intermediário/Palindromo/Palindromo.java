package palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();

		palindromo(palavra);

	}

	public static void palindromo(String word) {
		String palavraInvertida = new StringBuffer(word).reverse().toString();
		if (word.equals(palavraInvertida)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
