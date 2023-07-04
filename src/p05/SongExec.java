package p05;

public class SongExec {

	public static void printSong(Song[] songs) {
		System.out.println("name" + songs[0]);
		System.out.println("singer" + songs[0]);
		System.out.println("rank" + songs[0]);

	}

	public static void main(String[] args) {
		Song[] songs = new Song[5];

		songs[0] = new Song();
		songs[0].name = " OMG";
		songs[0].singer = " NewJeans";
		songs[0].rank = 1;

		songs[1] = new Song();
		songs[1].name = " Unforgiven";
		songs[1].singer = " 르세라핌";
		songs[1].rank = 2;

		songs[2] = new Song();
		songs[2].name = " 물론";
		songs[2].singer = " 허각";
		songs[2].rank = 6;

		songs[3] = new Song();
		songs[3].name = " hypeboy";
		songs[3].singer = " NewJeans";
		songs[3].rank = 18;

		songs[4] = new Song();
		songs[4].name = " 여행";
		songs[4].singer = " 볼빨간사춘기";
		songs[4].rank = 25;
		
		Song fSong = songs[0];
		Song lSong = songs[0];
		
		for(int i=1;i<songs.length;i++) {
			if(fSong.rank > songs[i].rank) {
				fSong = songs[i];
			}
			if(lSong.rank < songs[i].rank) {
				lSong = songs[i];
			}
		}
		
		System.out.println("가장높은순위"+"일등: " + fSong.singer + " 의" + fSong. name);
				System.out.println("가장낮은순위"+"꼴등: " + lSong.singer + " 의" + lSong. name);
		
		
		
		int minrank = songs[0].rank;
		int minidx = 0;
		
		int maxrank = songs[0].rank;
		int maxidx = 0;
		
		for(int i=1;i<songs.length; i++) {
			if(minrank>songs[i].rank) {
				minrank = songs[i].rank;
				minidx = i;
			}
			if(maxrank<songs[i].rank) {
				maxrank = songs[i].rank;
				maxidx = i;
			}
		}
		
		
		

	}

}
