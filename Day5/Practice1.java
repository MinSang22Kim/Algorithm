package Day5;

class TV {
	String brand;
	int year;
	int size;

	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n", this.brand, this.year, this.size);
	}
}

public class Practice1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}