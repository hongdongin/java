package p07;

public class Son extends Father{  //Son은 3가지로 불릴 수 있다 Son,Father,object
	public String hobby;
	
	public void printHobby() {
		System.out.println(name + "님의 취미는" + hobby + "입니다.");
	}
}
