package calculator;

public class StringAddCalculator {
	public static int splitAndSum(String text) {

		if (isItOneWord(text)) {
			return Integer.parseInt(text);
		}

		return 0;
	}

	private static boolean isItOneWord(String text) {
		return text.length() == 1;
	}
}
