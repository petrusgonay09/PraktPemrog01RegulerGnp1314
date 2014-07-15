//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 1
package PraktikumSoal01.bin;

class Perkutut extends Hewan {
	public Perkutut(){
		super("perkutut", 2,true);
	}
	public void bersuara() {
		System.out.println("\ncuit, cuit, cuit");
	}
	public static void main(String[] petrus) {
		Perkutut p = new Perkutut();
		p.isHewan();
		p.bersuara();
	}
}