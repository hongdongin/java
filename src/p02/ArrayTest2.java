package p02;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] strs = new String[10];
		/*
		 * 0 -> 2 1
		 * 1 -> 4 2
		 * 2 -> 6 3
		 * 3 -> 8 4
		 * ....
		 * 9 -> 20 
		 */
		for(int i=0;i<10;i++) {
			strs[i] = (i+1) * 2 + "";
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("strs[" + i + "] = " + strs[i]);
		}
	}
}

