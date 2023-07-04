package p05;

public class FoodExec {
    
	// [f, f, f, f]
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식:" + f.name);
			System.out.println("가격:" + f.price + "원");
			System.out.println("타입:" + f.type);
			System.out.println("----------------");
		}		
	}
	
	
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "삼겹살"	;
		f.price = 15000;
		f.type = "한식";
		
		Food f1 = new Food();
		f1.name = "떡볶이";
		f1.price = 4000;
		f1.type = "한식";
		
		Food f2 = new Food();
		f2.name = "파스타";
		f2.price = 15000;
		f2.type = "양식";
		
		Food f3 = new Food();
		f3.name = "국밥";
		f3.price = 10000;
		f3.type = "한식";
		
		Food f4 = new Food();
		f4.name = "라멘";
		f4.price = 8000;
		f4.type = "일식";
		
		/*printFood(f);
		printFood(f1);
		printFood(f2);
		printFood(f3);
		printFood(f4);*/
		
		
		Food[] foods = new Food[5];
		
		foods[0] = f;
		foods[1] = f1;
		foods[2] = f2;
		foods[3] = f3;
		foods[4] = f4;
		
		printFood(foods);
	    
	}
}
