//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 5
package PraktikumSoal05.bin;

public class TestMobil
{
	public static void main(String[] petrus)
	{
		Mobil mobil = new Mobil()
		{
	public void injakPedalGas()
	{
		System.out.println("Mobil berjalan...");
	}	
	};
	
		Kijang kijang = new Kijang();
		BMW bmw = new BMW();
		
		mobil.injakPedalGas();
		
		mobil = kijang;
		mobil.injakPedalGas();
		
		mobil = bmw;
		mobil.injakPedalGas();
	}
}