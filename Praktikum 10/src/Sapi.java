//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 1
package PraktikumSoal01.bin;

class Sapi extends Hewan{
	public Sapi(){
		super("sapi", 4, false);
	}
	public void bersuara(){
		System.out.println("\nemoh...,emoh...");
	}
	public static void main(String[] petrus){
		Sapi s = new Sapi();
		s.isHewan();
		s.bersuara();
	}
}