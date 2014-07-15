//Materi	: CALCULATOR
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,20-06-2014
//Tugas Praktikum 9
package tugas2.bin;

import latihan.bin.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{
	
	public Integer tambah (int bil1, int bil2){
		return bil1 + bil2;
	}
	
	
	public Integer kurang (int bil1, int bil2){
		return bil1 - bil2;
	}
	
	
	public Integer kali (int bil1, int bil2){
		return bil1 * bil2;
	}
	
	
	public Integer bagi (int bil1, int bil2){
		return bil1 / bil2;
	}
}