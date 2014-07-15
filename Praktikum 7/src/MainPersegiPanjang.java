//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 3
package Praktikum7.bin;

public class MainPersegiPanjang {
	public static void main(String[] petrus) {
		PersegiPanjang pp = new PersegiPanjang();
		pp.setPanjang(10);
		pp.setLebar(20);
		System.out.println("Panjang :"+ pp.getPanjang());
		System.out.println("Lebar :"+ pp.getLebar());
		System.out.println("Luas :"+ pp.getLuas());
	}
}