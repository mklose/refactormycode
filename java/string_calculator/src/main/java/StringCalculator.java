public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		return sum(extractNumbers(s));
	}

	private String[] extractNumbers(String s) {
		String[] numbers;
		if (hasCustomSeparator(s)) {
			numbers = s.substring(4).split("[\n" + s.charAt(2) + "]");
		} else {
			numbers = s.split("[\n,]");
		}
		return numbers;
	}

	private boolean hasCustomSeparator(String s) {
		return s.startsWith("//");
	}

	private int sum(String[] numbers) {
		int result = 0;
		for (String n : numbers) {
			result += Integer.parseInt(n);
		}
		return result;
	}
}
