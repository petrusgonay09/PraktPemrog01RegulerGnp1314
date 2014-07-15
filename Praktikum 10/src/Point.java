//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 4
package PraktikumSoal04.bin;

public class Point extends Shape
{
	static int x, y;
	public Point() {
		x = 0;
		y = 0;
	}
	public double area()
	{
		return 0;
	}
	public double perimeter()
	{
		return 0;
	}
	public static void print()
	{
		System.out.println("point:" + x + "," + y);
	}
	public static void main(String[] petrus)
	{
		Point p = new Point();
		p.print();
	}
}