
public class Test01 {
	public static void main(String[] args) {
		int inx = 15;
		if (10 < inx && inx < 20) {
			System.out.println("true");
		}
		char ch1 = ' ';
		if (ch1 != ' ' || ch1 != '\t') {
			System.out.println("ch1 true");
		}
		char ch2 = 'x';
		if (ch2 == 'x' || ch2 == 'X') {
			System.out.println("true");
		}
		char ch3 = '0';
		if ('0' <= ch3 && ch3 <= '9') {
			System.out.println("ch3 true");
		}
		char ch4 = 'a';
		if (('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z')) {
			System.out.println("ch4 true");
		}
		int year = 400;
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("year true");
		}
		boolean powerOn = false;
		if (!powerOn) {
			System.out.println("powerOn true");
		}
	}

}
