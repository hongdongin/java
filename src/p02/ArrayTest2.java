package p02;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] strs =  new String[10];
		
		/*
		 *  0 ->2
		 *  1->4
		 *  2->8
		 *  .....
		 *  9 -> 20
		 */
		
		for(int i=0; i<=20; i+=2) {
			System.out.println(i);
			
		}
	}

}
