package p04;

public class cafe {

	public static String getCoffee(String order, int price) {
		int coffeeprice = 5000;
		if (coffeeprice > price) {
			return (coffeeprice - price) + "원이 부족합니다";
		}
		String str = "";
		if(coffeeprice<price) {
			str = (price-coffeeprice) +"원 잔돈이 남았습니다.";
		}
		return "주문하신 " + coffeeprice + "원 짜리" + order + " 가 준비되었습니다. " + str;
	}

	public static void main(String[] args) {
		String coffee = getCoffee(" 아아", 2000);
		System.out.println(coffee);
		coffee = getCoffee("아아", 6000);
		System.out.println(coffee);
		coffee = getCoffee("아아", 5000);
		System.out.println(coffee);
	}
}
