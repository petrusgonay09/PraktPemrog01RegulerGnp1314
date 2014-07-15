//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 5
package Praktikum7.bin;

public class Employee {
	private String name;
	private double salary;
	protected Employee(String n, double s) {
		name = n;
		salary = s;
	}
	protected String getDetails() {
		return "Name :"+name+ "\nSalary :"+salary;
	}
	public void cetak() {
		System.out.println("Coba di Employee");
	}
}