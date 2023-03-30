package aplicacao;

import java.io.IOException;
import java.util.Scanner;

public class SelecaoDeAnimais {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		String AN1, AN2, AN3;

		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("onivoro")) {
			System.out.print("homem");
		}
		if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("carnivoro")) {
			System.out.print("aguia");
		}
		if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("onivoro")) {
			System.out.print("pomba");
		}
		if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("herbivoro")) {
			System.out.print("vaca");
		}
		if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("hematofago")) {
			System.out.print("pulga");
		}
		if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("herbivoro")) {
			System.out.print("lagarta");
		}
		if (AN1.equals("invertebrado") && AN2.equals("anelídeo") && AN3.equals("hematofago")) {
			System.out.print("sanguessuga");
		}
		if (AN1.equals("invertebrado") && AN2.equals("anelídeo") && AN3.equals("onivoro")) {
			System.out.print("minhoca");
		}

	}

}
