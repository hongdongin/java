package p03;

public class ArrayTest {

	public static void main(String[] args) {
		int [] ages = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] tmp = ages;
		ages = new int[7];
		//0 1 2 3 4 5 6 7 8 9 
		//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 age
		for(int i=0; i<ages.length;i++) {
			System.out.println("ages + [" + i + "] : " + ages[i]);
		}
		int max = ages.length;
		if(ages.length > tmp.length) {
			max = tmp.length;
		}
		
		for(int i=0;i< max; i++) {
			 ages[i] = tmp[i];
		}
		
		for(int i=0; i<ages.length;i++) {
			System.out.println("ages + [" + i + "] : " + ages[i]);
		}
	}
}
