//Materi	: KONSEP OOP & IMPLEMENT INHERITANCE
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,19-06-2014
//Praktikum Soal 1
package tugas2.bin;;

//import service.CalculatorService;
//import service.impl.CalculatorServiceImpl;

public class MainClass
{
	public static void main(String[] petrus)
	{
		CalculatorService service = new CalculatorServiceImpl();
		Integer a = service.tambah(200, 4);
		Integer b = service.kurang(200, 4);
		Integer c = service.kali(200, 4);
		Integer d = service.bagi(200, 4);
		
		System.out.println("Output");
		System.out.println("Nilai a : " + a);
		System.out.println("Nilai b : " + b);
		System.out.println("Nilai c : " + c);
		System.out.println("Nilai d : " + d);
	}
}