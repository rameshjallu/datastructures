package dp;

public class Dice {

	public static void main(String[] args) {

	}

	public static void dice(int i, int j, int[] mem, int n) {

		for (; i < 2; i++) {
			for (; j < n; j++) {

				leftMove(i, j, mem, n);
				rightMove(i, j, mem, n);

			}
		}
	}

	public static void leftMove(int i, int j, int[] mem, int n) {
		
	}

	public static void rightMove(int i, int j, int[] mem, int n) {

	}
}
