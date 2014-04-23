//Created By Petrus Gonay(4512212042)
//Kamis,03-04-2014
//ANATOMI DAN APLIKASI JAVA,CLASSPATH

//Constructor
public class Person{
	public Person(){
		Person p = new Person();
	}
	public Person(String nama){
		Person dadang = new Person("dadang");
	}
	public Person(String nama,int 1){
		Person Jimmy = new Person("Jimmy", 1);
	}
}
//Cara Pemanggilannya:
/*Person p = new Person();-->Constructor Pertama
Person dadang = new Person("dadang");-->Constructor Kedua
Person Jimmy = new Person("Jimmy", 1);-->Constructor Ketiga
*/