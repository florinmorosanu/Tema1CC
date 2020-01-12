import java.util.Scanner;

public class Tema1_ID_1 {

	private static Scanner sc;

	public static void main(String[] args) {
		// 1) Sa se determine de cate ori apare un anumit caracter nsole.rintr-un sir de
		// caractere dat.

		System.out.println("Introduceti cuvantul: ");
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Introduceti caracterul cautat: ");
		char c = sc.nextLine().charAt(0);
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == c) {
				counter++;
			}
		}
		System.out.println("Caracterul apare de: " + counter + " ori");
	}
}