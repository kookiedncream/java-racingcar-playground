package calculator;

public class StringAddCalculator {
	public static int splitAndSum(String text) {

		if (text == null || text.isEmpty()) {
			return 0;
		}

		if (isItOneWord(text)) {
			return Integer.parseInt(text);
		}

		String[] split = text.split(",|:");
		int sum = 0;

		if (split.length > 1) {
			sum = getSum(sum, split);
			return sum;
		}

		return sum;
	}

	private static int getSum(int sum, String[] tokens) {
		int length = tokens.length;
		for (int i = 0; i < length; i++) {
			sum += Integer.parseInt(tokens[i]);
		}
		return sum;
	}

	private static boolean isItOneWord(String text) {
		return text.length() == 1;
	}
}
