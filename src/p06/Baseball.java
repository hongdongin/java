package p06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int [] baseballnum = new int[3];
		
		for(int i=0; i<baseballnum.length; i++) {
			int baseball = random.nextInt(9);
			baseballnum[i] = baseball ;
			for(int j=0; j<i; j++) {
				if(baseballnum[i] == baseballnum[j]) {
					i--;
					break;
				}
			}
		}
		
		baseballnum = new int[] {5,0,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("네가 생각하는 숫자를, 를 기준으로 3개만 불러봐: ");
		String baseballnumStr = sc.nextLine();
		int count=9;
		String[] baseballnumStrs = baseballnumStr.split(",");
		int [] baseballNums = new int [baseballnumStrs.length];
		for(int i=0; i<baseballnumStrs.length;i++) {
		//baseballNums[i] = Integer.parseInt(baseballnumStrs[i]);
		
		if (baseballNums[i] == Integer.parseInt(baseballnumStrs[i])) {
			count++;

		  }
		System.out.print("ball"+ ": " + count+" , "+ "strike"+ ": " + count);
		}
		
	}

}
