package p07;

class Song {
	public int rank;
	public String title;
	public void printTitle() {
		System.out.println("노래제목 : "+ title);
	}
	

}

public class SonExec {

	public static void main(String[] args) {

		Son s = new Son();
		/*
		 * Father f =new Son(); Object o =new Son(); Object o1 = new String("123");
		 */
		s.name = "동동";
		s.job = "개발자";
		s.age = 30;
		s.hobby = "게임";
		Father f = new Son();
		Son s2 = (Son)f;
		s2.hobby = "투자";
		System.out.println(s2.name);
		s.printJob();
		s.printHobby();
		//Father f = new Father();
		f.name = "동동이";
	  
		
		
		
		Song song = new Song();
		song.title = "타이틀";
		song.printTitle();
		
	
	}
}
