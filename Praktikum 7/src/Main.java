//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 1
package Praktikum7.bin;

class Main
{
	public static void main(String[] petrus)
	{
		Santapan s = new Santapan();
		Makanan ma = new Makanan();
		Minuman mi = new Minuman();
		Cemilan ce = new Cemilan();
		
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}