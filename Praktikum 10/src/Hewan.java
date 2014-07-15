//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 1
package PraktikumSoal01.bin;

abstract class Hewan {
	protected String nama;
	protected int jumkaki;
	protected boolean bisaTerbang = false;
	
	public Hewan(String nama, int kaki, boolean terbang){
		this.nama = nama;
		jumkaki = kaki;
		bisaTerbang = terbang;
	}
	public abstract void  bersuara();
	
	public static void makan(){
		System.out.println("nyam, nayam, nyam");
	}
	public void isHewan () {
		System.out.println("nama:" + nama);
		System.out.println("jumlah kaki:" + jumkaki);
		System.out.println("bisa terbang:" + bisaTerbang);
	}
}