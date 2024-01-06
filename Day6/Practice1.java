package Day6;
class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	protected int getColor() {
		return color;
	}

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.printf("%d인치 %d Color TV\n", getSize(), getColor());
	}
}

class IPTV extends ColorTV {
	private String address;

	protected String getAddress() {
		return address;
	}

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.printf("%s 주소의 %d인치 %d컬러 IPTV\n", getAddress(), getSize(), getColor());
	}
}

public class Practice1 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}
}
