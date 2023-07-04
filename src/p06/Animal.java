package p06;

public class Animal {

	public String name;
	public String type;
	public char trans;
	public String address;
	
	public void eat() {
	System.out.println(name + "이가 먹는다." );	
	}
	
	public void run( ) {
		System.out.println(name + "이가 달린다." );	
	}
	
	public void hunt() {
		System.out.println(name + "이가 사냥하다." );	
	
	 }
	
	public void fly( ) {
		System.out.println(name +"가 난다.");
	}
}
