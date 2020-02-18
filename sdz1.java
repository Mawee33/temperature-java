package projet1;

import java.util.Scanner;
import java.util.*;

public class sdz1 {

	public static void main(String[] args) {
		int temperature = ' ';
		byte reponse = ' ';
		byte reponse2 = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("Choisissez le mode de conversion: \n"
				+ "1 - Convertisseur Celsius/Farenheit \n"
				+ "2- Convertisseur Farenheit/Celsius");
		reponse = sc.nextByte();
		while(reponse == 1) 
		{
			System.out.print("Température à convertir:");
			temperature = sc.nextInt();
			System.out.print(temperature + "°C correspond à " + (9/5 * temperature + 32) + "°F. \n");
			System.out.print("Souhaitez-vous convertir une autre température? \n1 = oui / 2 = non");
			reponse = ' ';
			reponse2 = sc.nextByte();
			while(reponse2 == 1) {
				System.out.print("Température à convertir:");
				temperature = sc.nextInt();
				System.out.print(temperature + "°C correspond à " + (9/5 * temperature + 32) + "°F.\n");
				System.out.print("Souhaitez-vous convertir une autre température? \n1 = oui / 2 = non");
				reponse2 = sc.nextByte();
				
		}
		while(reponse == 2 ) 
		{
			System.out.print("Temperature à convertir:");
			temperature = sc.nextInt();
			System.out.print(temperature + "°F correspond à " + ((temperature - 32) * 5 / 9)+ "°C.\n");
			System.out.print("Souhaitez-vous convertir une autre température? \n1 = oui / 2 = non");
			reponse = ' ';
			reponse2 = sc.nextByte();
			while(reponse2 == 1) {
				System.out.print("Température à convertir:");
				temperature = sc.nextInt();
				System.out.print(temperature + "°F correspond à " + ((temperature - 32) * 5 / 9)+ "°C.\n");
				System.out.print("Souhaitez-vous convertir une autre température? \n1 = oui / 2 = non");
				reponse2 = sc.nextByte();
			}
		}
		}
		System.out.print("Au revoir!");
	}

}

