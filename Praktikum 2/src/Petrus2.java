//Created By Petrus Gonay(4512212042)
//Kamis,10-04-2014
//VARIABEL DAN TIPE DATA

package PraktikumSoal2.bin;

public class Petrus2 {
	private String nama;
	public static void main(String[] petrus){
		Petrus2 test;
		test = new Petrus2();
		test.setNama ("Petrus");
		byte b = 100;
		short s =100;
		
		Petrus2 belajarVariabel = test;
		belajarVariabel.setNama("belajar variabel");
		
		System.out.println(b + s);
		System.out.println("nama: " + test.getNama() + "" +b);
	}
	public void setNama (String aNama){
		this.nama = aNama;
	}
	public String getNama(){
		return this.nama;
	}
}