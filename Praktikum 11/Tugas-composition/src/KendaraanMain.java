//Materi	: COMPOSITION & AGGREGATION
//Create By	: Petrus Gonay(4512212042)
//Date		: Selasa,24-06-2014
//Tugas Praktikum 11
package tugas3.bin;

public class KendaraanMain{
	public static void main(String[] petrus){
		Motor motor = new Motor();
		Mobil mobil = new Mobil();
		
		motor.jumping();
		System.out.println("Roda motor : " + motor.roda);
		mobil.mundur();
		System.out.println("Roda mobil : " + mobil.roda);

	}
}