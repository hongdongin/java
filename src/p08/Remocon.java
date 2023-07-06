package p08;

public class Remocon implements Remote  {

	@Override
	public void on() {
		System.out.println("킵니다.");
		
	}

	@Override
	public void off() {
		System.out.println("끕니다.");
		
	}

	public void Up() {
		System.out.println("올립니다.");
		
	}	
	public void Down() {
		System.out.println("내립니다.");
		
	}

	

}
