package p07;

public class FinalTest { // package public class는 모두 예약어이고 예약어끼리 클래스를 쓸 수없다.
    final int NUM = 1; // main 위에 final int를 쓸 경우 변수는 무조건 대문자로 써야한다.
    final int NUM_TEST =1;// 문자와 문자사이에 "_"를 쓴다.
	public static void main(String[] args) {
		final int num =1; //int에 final이 붙을 경우 상수이므로 값을 변경할 수 없다. //final은 class, 변수, method에 쓸 수 있다.
	}

}
