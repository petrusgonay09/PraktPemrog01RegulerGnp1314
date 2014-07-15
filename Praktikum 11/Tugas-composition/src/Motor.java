//Materi	: COMPOSITION & AGGREGATION
//Create By	: Petrus Gonay(4512212042)
//Date		: Selasa,24-06-2014
//Tugas Praktikum 11
package tugas3.bin;

public class Motor extends Kendaraan{
	// public String jumlahroda=2;
	public Motor (){
		super.roda=2;
	}
	void jumping(){
		System.out.println("kendaraan dapat melakukan jumping");
	}
}