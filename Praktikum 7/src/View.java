//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 5
package Praktikum7.bin;

public class View {
	public static void main(String[] petrus){
		Employee e = new Employee("Ali",1200000);
		Employee em = new Manager("Ali",1200000,"Informatika");
		System.out.println("Data employe :\n"+e.getDetails());
		System.out.println("Data manager :\n"+em.getDetails());
		em.cetak();
	}
}