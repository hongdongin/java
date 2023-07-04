package p03;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numsArray = new int[3][3];
		System.out.println(numsArray.length);

		int count = 1;
		for (int i = 0; i < numsArray.length; i++) {
			// System.out.println(numsArray[i].length);
			for (int j = 0; j < numsArray.length; j++) {
				numsArray[i][j] = count++;
			}
			for (int k = 0; k < numsArray.length; k++) {
				System.out.println(numsArray[i][k]);
			}

		}
	}

}




