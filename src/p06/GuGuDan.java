package p06;

public class GuGuDan {

	public static void main(String[] args) {

		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
				if (j == 9) {
					System.out.println();
				} else {
					System.out.print(",");
				}
				
			}
		}

	}
}
