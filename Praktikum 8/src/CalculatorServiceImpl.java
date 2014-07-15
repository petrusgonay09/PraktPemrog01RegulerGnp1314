//Materi	: KONSEP OOP & IMPLEMENT INHERITANCE
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,19-06-2014
//Praktikum Soal 1
package tugas2.bin;

//import service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService
{
	@Override
	public Integer tambah(int bil1, int bil2)
	{
		return bil1 + bil2;
	}
	@Override
	public Integer kurang(int bil1, int bil2)
	{
		return bil1 - bil2;
	}
	@Override
	public Integer kali(int bil1, int bil2)
	{
		return bil1 * bil2;
	}
	@Override
	public Integer bagi(int bil1, int bil2)
	{
		return bil1 / bil2;
	}
}