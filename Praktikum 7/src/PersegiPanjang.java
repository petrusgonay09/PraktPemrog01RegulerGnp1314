//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 3
package Praktikum7.bin;

public class PersegiPanjang
{
	private double panjang;
	private double lebar;
	private double tinggi;
	public PersegiPanjang()
	{
		panjang = 0;
		lebar = 0;
	}
	
	private double luas(double p, double l)
	{
		return p*l;
	}
	
	public void setPanjang(double panjang)
	{
		this.panjang = panjang;
	}
	
	public void setLebar(double lebar)
	{
		this.lebar = lebar;
	}
	
	public double getPanjang()
	{
		return panjang;
	}
	
	public double getLebar()
	{
		return lebar;
	}
	
	public double getLuas()
	{
		return luas(panjang, lebar);
	}
	
}