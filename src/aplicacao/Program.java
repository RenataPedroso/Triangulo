package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as dimens?es do tri?ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as dimens?es do tri?ngulo X: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("?rea do tri?ngulo X: %.4f%n", areaX);
		System.out.printf("?rea do tri?ngulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O tri?ngulo que possui a maior ?rea ? o: X");
		} else {
			System.out.println("O tri?ngulo que possui a maior ?rea ? o: Y");
		}
		
		sc.close();
	}

}
