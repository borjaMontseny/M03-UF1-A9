package a9;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Fes un programa que generi una matriu de 4x4, demani els valors a l'usuari
		 * i després determini quin és el número més gran i més petit.
		 */

		int array[][] = new int[4][4];

		System.out.println("Omple l'array amb enters\n");

		Scanner sc = new Scanner(System.in);

		// i = files j = columnes
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("Valor de la posició " + (i + 1) + " " + (j + 1) + ": ");
				array[i][j] = sc.nextInt();

			}
		}

		sc.close();

		// declarem els valors minims/màxims per poder comparar
		int valorMinim = array[0][0];

		int valorMaxim = array[0][0];

		// tornem a recorrer el array ja omplert, ara comparant
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				// comparem minim
				if (array[i][j] < valorMinim) {
					valorMinim = array[i][j];
				}

				// comparem màxim
				if (array[i][j] > valorMaxim) {
					valorMaxim = array[i][j];
				}

			}
		}

		System.out.println("\nValor més petit de la matriu: " + valorMinim);
		System.out.println("Valor més gran de la matriu: " + valorMaxim);

	}

}
