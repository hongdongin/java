package p06;

class Car {
	public String name;
	public static String type;

}

public class InstanceTest {

	public static void main(String[] args) {
		Car c = null;
		System.out.println(c);
		//System.out.println(c.name); //NullPointerException 발생
		
		Car.type = "승용차";
		Car sonata = new Car();
		
		System.out.println(sonata.name);
		sonata.name = "소나타";
		System.out.println(sonata.name);
	}
}





