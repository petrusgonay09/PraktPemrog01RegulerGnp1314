//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 3
package PraktikumSoal03.bin;

public class Circle extends GraphicObject 
{
	void resize()
	{
		System.out.println("circle Resize");
	}
	void drawShape()
	{
		System.out.println("circle Shape");
	}
	void posisition()
	{
		System.out.println(this.x + this.y);
	}
}