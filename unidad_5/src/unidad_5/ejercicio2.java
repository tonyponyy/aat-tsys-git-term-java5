package unidad_5;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Como te llamas ?");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Hola "+name);

	}

}
