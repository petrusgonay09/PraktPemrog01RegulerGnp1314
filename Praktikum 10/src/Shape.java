//Materi	: ABSTRACT CLASS & INTERFACE
//Create By	: Petrus Gonay(4512212042)
//Date		: Senin,23-06-2014
//Praktikum Soal 4
package PraktikumSoal04.bin;

abstract class Shape {
	public String color;
	public Shape() {
	}
	public void setColor(String c) {
		color = c;	
	}
	public String getColor() {
		return color;
	}
	abstract public double area();
}