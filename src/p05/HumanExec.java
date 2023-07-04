package p05;

public class HumanExec {

	public static void main(String[] args) {
		Human[] h = new Human[5];

		h[0] = new Human();
		h[0].money = 1000000;
		h[0].name = "홍길동";

		h[1] = new Human();
		h[1].money = 2000000;
		h[1].name = "김길동";

		h[2] = new Human();
		h[2].money = 3000000;
		h[2].name = "김철수";

		h[3] = new Human();
		h[3].money = 4000000;
		h[3].name = "홍동인";

		h[4] = new Human();
		h[4].money = 5000000;
		h[4].name = "김신";

		int sum = 0;
		for (int i = 0; i < h.length; i++) {
			sum += h[i].money;

		}
		System.out.println("5명이 가진 총액 : " + sum);
		int avg = sum/h.length;
		System.out.println("5명의 평균액 : " + avg);
		String names = "";
		for(int i=0;i< h.length;i++) {
			if(avg<=h[i].money) {
				names += h[i].name + "님, ";
			}
		}
		names = names.substring(0, names.length()-2);
		System.out.println(names + "은 평균 이상입니다.");
	}
}











