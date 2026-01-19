package application;

import java.util.Locale;
import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do array?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		
		for (int i = 0; i<n ; i++) {
			sc.nextLine();
			System.out.println("Digite o "+ i +"-esimo numero");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("Os numeros lidos foram: ");
		for (int i = 0;i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
	}
}
