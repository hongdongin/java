package p02;

public class Lotto {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			double db  = Math.random();
			db *=45;  // 0 ~ 44.999999
			db += 1;  // 1 ~ 45.999999
			int rNum = (int)db; //1~45
	        lotto[i] = rNum;
		}
		
		// 다른 for문을 만들어서 출력해주세요
		
		for(int i=0;i<lotto.length; i++) {
			System.out.println("lotto["+ i +"] = " +lotto[i]);
		}
	    
	}

}
