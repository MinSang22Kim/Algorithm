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

	public ColorTV() {

	}

	public ColorTV(int size, int color) {
		this.size = size;
		this.color = color;
	}
}

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		this.address = address;
	}
}

public class Practice1 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);

	}
}
