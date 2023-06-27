package p01;

public class Convert {

	public static void main(String[] args) {
		int i =1;
		String s = "1";
		String s1 = i + "";
		System.out.println(s.equals(s1));
		
		int i1 = Integer.parseInt(s1);
		System.out.println(i==i1);
		
		String str = "백이십";
		int i2 = Integer.parseInt(str);
		System.out.println(i2);          //Integer를 쓰는 경우 형변환 즉 문자열을 int로 바꾸기 위해 쓴다.
	}
}
