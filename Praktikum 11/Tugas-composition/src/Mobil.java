//Materi	: COMPOSITION & AGGREGATION
//Create By	: Petrus Gonay(4512212042)
//Date		: Selasa,24-06-2014
//Tugas Praktikum 11
package tugas3.bin;

public class Mobil extends Kendaraan{
	// public String jumlahroda=2;
	public Mobil (){
		super.roda=4;
	}
	void mundur(){
		System.out.println("kendaraan dapat melakukan mundur");
	}
}