//Materi	: ENCAPSULATION & POLYMORPHISM
//Create By	: Petrus Gonay(4512212042)
//Date		: Kamis,12-06-2014
//Praktikum Soal 4
package Praktikum7.bin;

public class EkspresiWajah {
	public String respons() {
		return("Perhatikan ekspresi wajah saya");
	}
}
class Gembira extends EkspresiWajah {
	public String respons() {
		return("ha ha ha...");
	}
}
class Sedih extends EkspresiWajah {
	public String respons() {
		return ("hik hik ngeee ngeee ngeee");
	}
}
class Marah extends EkspresiWajah {
	public String respons() {
		return ("Hai kurang ajar!");
	}
}