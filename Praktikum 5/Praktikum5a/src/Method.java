//Method dan Exception
//Praktikum Soal 4
//Created By	: Petrus Gonay
//Date			: Kamis, 22 Mey 2014
package praktikum05.bin;

import java.util.Scanner;

public class Method {
	public static void main(String[] petrus) {
		Scanner input = new Scanner (System.in);
		Tuna tunaObject = new Tuna();
		System.out.println("Enter your name here : ");
		String name = input.nextLine();
		tunaObject.simpleMessage(name);
	}
}