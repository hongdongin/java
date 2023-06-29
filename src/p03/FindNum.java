package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean correct = false; // 일단 false로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10) + 1; // 1-10
		int count = 0;		// 입력 횟수
		
        while(!correct) {
        	System.out.println(" 1부터 10까지 숫자 입력하세요 : ");
        	int inputNum = Integer.parseInt(scan.nextLine());
        	count++;		// 입력할 때 마다 1증가
        	
        	if(rNum == inputNum) {
        		System.out.println("맞췄다!!"); // correct = rNum == inputNum; i++;  System.out.println("맞췄다!!"); 이렇게 해도 됨
        		System.out.println(count + "번만에 맞췄다!!");
        	     correct = true;                      
        	}
        	
        	
        }
        
	}

}
