package Day5;

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song() {

	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.printf("%d년 %s 국적의 %s가 부른 %s\n", year, country, artist, title);
	}
}

public class Practice3 {
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		s.show();
	}
}
