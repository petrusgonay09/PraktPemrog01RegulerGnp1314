//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 1
package PraktikumSoal01.bin;

class SpongeBob extends Hewan implements Manusia 
{
	public SpongeBob() 
	{
	super("sponge bob", 2, false);
	}
	public void bersuara()
	{
		System.out.println("\nhallo patric...");
	}
	public void menyanyi()
	{
		System.out.println("ye, ye, ye, wik, wik, wik");
	}
	public void ketawa()
	{
		System.out.println("kek, kek, kek");
	}
	public static void makan()
	{
		System.out.println("uenak tenan...");
	}
	public void makan2()
	{
		super.makan();
	}
	public static void main(String[] petrus)
	{
		SpongeBob s = new SpongeBob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		s.makan();
		Hewan.makan();
		makan();
	}
}