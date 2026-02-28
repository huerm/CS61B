public class SpeedTestAList {
	public static void main(String[] args) {
		AListint L = new AListint();
		int i = 0;
		while (i < 10000000) {
			L.addLast(i);
			i = i + 1;
		}
	}
} 