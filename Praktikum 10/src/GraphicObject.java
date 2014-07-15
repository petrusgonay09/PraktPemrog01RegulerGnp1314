//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 3
package PraktikumSoal03.bin;

abstract class GraphicObject {
	int x,y;
	void moveTo(int newValueX, int newValueY){
		x = newValueX;
		y = newValueY;
	}
	abstract void drawShape();
	abstract void resize();
}