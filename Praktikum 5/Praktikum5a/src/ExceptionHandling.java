//Method dan Exception
//Praktikum Soal 1
//Created By	: Petrus Gonay
//Date			: Kamis, 22 Mey 2014
package praktikum05.bin;

public class ExceptionHandling {
	public static void main(String[] petrus){
		int[] array = new int[3];
		try{
			array[5] = 1;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error!!" +e.toString());
		}
	}
}