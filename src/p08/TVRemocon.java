package p08;

public class TVRemocon extends Remocon {
	public void on() {
		System.out.println(" TV를 킵니다.");
		
	}

	@Override
	public void off() {
		System.out.println("TV를 끕니다.");
		
	}	
	
	public void chUp() {
		System.out.println("TV채널을 올립니다.");
	}public void chDown() {
		System.out.println("TV채널을 올립니다.");
	}
}

