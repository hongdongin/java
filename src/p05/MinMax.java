package p05;

public class MinMax {

	public static void main(String[] args) {

		int[] nums = new int[] { 10, 22, 5, 8, 25 };

		int max = nums[0];
		int maxidx = 0;
		int min = nums[0];
		int minidx = 0;
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
				maxidx = i;
			} else if (min > nums[i]) {
				min = nums[i];
				minidx = i;
			}
		}
		System.out.println("최댓값 : " + max + ",index: " + maxidx);
		System.out.println("최솟값: " + min + ",index:" + minidx);
	}
}
