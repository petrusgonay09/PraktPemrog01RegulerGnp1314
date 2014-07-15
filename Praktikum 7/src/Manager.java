//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 5
package Praktikum7.bin;

public class Manager extends Employee{
	private String departement;
	public Manager(String nama, double salary,String dep) {
		super(nama, salary);
		departement = dep;
	}
	public String getDepartement() {
		return departement;
	}
	
	public String getDetails() {
		return super.getDetails()+"\nDepartement :"+getDepartement();
	}
	
	public void cetak() {
		System.out.println("Coba di Manager");
	}
}