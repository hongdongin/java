package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

	public static void main(String[] args) {
		/*
		 * int[] lotto = new int[6]; <-- 만들어서 랜덤이던 매쓰.랜덤이던 로또번호를 6개 만들어서 위에 넣으세요.
		 */

		Random random = new Random();
		int[] lotto = new int[6]; // 0 0 0 0 0 0 (값)
									// 0 1 2 3 4 5 (인덱스)
		for (int i = 0; i < lotto.length; i++) {
			int lottorNum = random.nextInt(45) + 1;
			lotto[i] = lottorNum;

		}
		// 1,2,3,4,5,6
		System.out.print("1~45까지의 숫자를 ,를 기준으로 6개를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		int count = 0;
		String[] strs = lottoStr.split(","); // [1, 2, 3, 4, 5, 6]
		for (int i = 0; i < strs.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				
				if(lotto[j] == Integer.parseInt(strs[i])) {
					count++;
					
				}
			}
		}
		System.out.println("많이 맞힌 갯수는 :" + count );
	}
}
