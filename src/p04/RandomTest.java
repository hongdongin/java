package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3);
		if (rNum == 0) {
			return "가위";
		}
		if (rNum == 1) {
			return "바위";

		}
		if (rNum == 2) {
			return "보";
		}
		return "";
	}

	public static void main(String[] args) {
		String rock = getRock();

		Scanner sc = new Scanner(System.in);
		System.out.println("가위,바위,보: ");
		String urRock = sc.nextLine();

		if (rock.equals("가위") && urRock.equals("가위")) {
			System.out.println("비겼습니다");
		}
		if (rock.equals("가위") && urRock.equals("바위")) {
			System.out.println("졌습니다");
		}
		if (rock.equals("가위") && urRock.equals("보")) {
			System.out.println("졌습니다");
		}
		if (rock.equals("바위") && urRock.equals("가위")) {
			System.out.println("졌습니다");
		}
		if (rock.equals("바위") && urRock.equals("바위")) {
			System.out.println("비겼습니다");
		}
		if (rock.equals("바위") && urRock.equals("보")) {
			System.out.println("이겼습니다");
		}
		if (rock.equals("보") && urRock.equals("가위")) {
			System.out.println("이겼습니다");
		}
		if (rock.equals("보") && urRock.equals("바위")) {
			System.out.println("졌습니다");
		}
		if (rock.equals("보") && urRock.equals("보")) {
			System.out.println("비겼습니다");
		}
	}

}
