package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random r = new Random();
       int [] nums  = new int[3];
       nums[0] = r.nextInt(10)+1;
       System.out.println(nums[0]);
       nums[1] = r.nextInt(10)+1;
       System.out.println(nums[1]);
       nums[2] = r.nextInt(10)+1;
       System.out.println(nums[2]);
       
       for(int i=0;i<3;i++) {
    	   nums[i] = r.nextInt(10)+1;
       }
       for(int i=0;i<3;i++) {
    	   System.out.println(nums[i]);
       }
	}

}
