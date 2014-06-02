//Method dan Exception
//Praktikum Soal 3
//Created By	: Petrus Gonay
//Date			: Kamis, 22 Mey 2014
package praktikum05.bin;

public class MethodReturnValues {
	public static void main (String[] petrus){
		myMethod();
		int myInt = 0;
		System.out.println(myInt);
		myInt = myMethod(); 
		System.out.println(myInt);
	}
	static int myMethod() {
		System.out.println("This Computer is lagging!");
		return 4;
	}
}