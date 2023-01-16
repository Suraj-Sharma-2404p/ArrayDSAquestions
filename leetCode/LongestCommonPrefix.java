package leetCode;

public class LongestCommonPrefix {
	static String longestPrefixSubstring(String[] str) {
		if (str.length == 0) {
			return "";
		}
		// hint : Start comparing with the second element of String array , if the
		// prefix does not matches the element decrese the prefix by one.
		String prefix = str[0];
		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] str = new String[] { "flower", "flowre", "flowight" };
		System.out.println(longestPrefixSubstring(str));
	}
}
