package Day6;

// Practice5

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String ket, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private int size;
	private int count;

	public Dictionary() {

	}

	public Dictionary(int size) {
		this.size = size;
		keyArray = new String[size];
		valueArray = new String[size];
		count = 0;
	}

	@Override
	public String get(String key) {
		for (int i = 0; i < count; i++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	public void put(String key, String value) {
		int num = count;
		for (int i = 0; i < count; i++) {
			if (key.equals(keyArray[i])) {
				num = i;
				break;
			}
		}
		keyArray[num] = key;
		valueArray[num] = value;
		count++;
	}

	@Override
	public String delete(String key) {
		String temp = "";
		for (int i = 0; i < count; i++) {
			if (key.equals(keyArray[i])) {
				temp = valueArray[i];
				keyArray[i] = "";
				valueArray[i] = "";
				count--;
				break;
			}
		}
		return temp;
	}

	@Override
	public int length() {
		return count;
	}
}

public class DictionaryApp extends Dictionary {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
