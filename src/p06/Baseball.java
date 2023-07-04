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
		System.out.println("네가 생각하는 숫자 3가지 골라봐: ");
		String baseballnumStr = sc.nextLine();
		String[] baseballnumStrs = baseballnumStr.split(",");
		int [] baseballNums = new int [baseballnumStrs.length];
		for(int i=0; i<baseballnumStrs.length;i++) {
		baseballNums[i] = Integer.parseInt(baseballnumStrs[i]);
		}
		
		int strike = 0;
		int ball = 0;
		for(int i=0; i<baseballnum.length;i++) {
			for(int j=0; j<baseballNums.length;j++) {
				
				if(baseballnum[i] == baseballNums[j]) {
					if(i==j) {
						strike ++;
					}else {
						ball++;
					}
					break;
				}
		    
		  }
		
		}
		
		System.out.println(strike +" strike , " + ball + " ball");
	}

}
