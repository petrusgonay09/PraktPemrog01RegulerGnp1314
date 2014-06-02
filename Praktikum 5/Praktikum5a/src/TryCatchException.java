//Method dan Exception
//Praktikum Soal 2
//Created By	: Petrus Gonay
//Date			: Kamis, 22 Mey 2014
package praktikum05.bin;

import java.io.*;

public class TryCatchException {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] petrus){
		try {
			System.out.println("Choose one of the options, (1-3)" + "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) Cheeseburger");
			System.out.print("Masukan Pilihan Anda : ");
			String choose = input.readLine();
			if (choose.equals("1")){
				System.out.println("Anda memilih Steak :-)");
			} else if(choose.equals("2")){
				System.out.println("Anda memilih Lobster:-D");
			} else if(choose.equals("3")){
				System.out.println("Anda memilih Cheeseburger:-)");
			} else {
					throw new Exception("pilihan anda tidak ada !");
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}