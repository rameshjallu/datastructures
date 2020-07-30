package adhoc;

public class AngleBetweenHandsofClock {

	public static void main(String[] args) {

		int h=9;
		int m=15;
		System.out.println(h+":"+m);
		System.out.println(angleClock2(h, m));
	}

	public static double angleClock(int hour, int minutes) {
		double d = (double) minutes / 2;

		double val = (double) Math.abs(30 * hour - 6 * minutes);

		double ans = 0;
		if (minutes / 5 >= hour) {
			ans = (double) Math.abs(val - d);
		} else {
			ans = (double) Math.abs(val + d);
		}

		if (ans > 180)
			return (double) 360 - ans;
		return ans;
	}

	public static double angleClock2(int hour, int minutes) {
		double a1 = 360.0 * (hour + (minutes / 60.0)) / 12;
		double a2 = 360.0 * minutes / 60;

		System.out.println(a1+" : "+a2);
		
		double temp = Math.abs(a1 - a2);
		return temp > 180 ? 360 - temp : temp;
	}
}
