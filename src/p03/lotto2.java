
package p03;

import java.util.Random;

public class lotto2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[6];		//0 0 0 0 0 0(값)
										//0 1 2 3 4 5(인덱스)
		for(int i=0;i<lotto.length ; i++) {
			int rNum = random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			
			if(lotto[i] == 0) {
				lotto[i] = rNum;
			}
		}

	
	}
}
