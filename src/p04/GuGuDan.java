package p04;

public class GuGuDan {

	public static void printGuGudan(int dan1, int dan2) {
		for (int i = 1; i <= dan1; i++) {
			for (int j = 1; j <= dan2; j++) {
				
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		printGuGudan(9,9);

	}
}
