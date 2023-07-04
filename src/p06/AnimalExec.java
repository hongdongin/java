package p06;

public class AnimalExec {

	public static void print(Animal[] animals) {
		for(int i=0; i<animals.length; i++) {
			Animal animal = animals[i];
			
			animal.run();
			if(!animal.name.equals("냥이")) {
			 animal.hunt();
			}
			if("새".equals(animal.type)) {
				animal.fly();
			}
			animal.eat();
		}
	}

	public static void main(String[] args) {

		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.type = "호랑이";
		/*tiger.eat();
		tiger.run();
		tiger.hunt();*/
		
		Animal cat = new Animal();
		cat.name = "냥이";
		//cat.type = "고양이";
		/*
		tiger.eat();
		tiger.run();
		tiger.hunt();*/
		
		Animal bird = new Animal();
		bird.name = "짹짹";
		bird.type = "새";
		
		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		print(animals);
	}
}
