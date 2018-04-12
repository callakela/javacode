
public class Palindrom {

	public boolean isStrPalindrom(String str) {

		boolean isPalindrom = false;

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i);
		}

		if (str.equalsIgnoreCase(rev)) {
			isPalindrom = true;
		}
		System.out.println("--" + isPalindrom);
		return isPalindrom;
	}

	public static void main(String[] args) {
		new Palindrom().isStrPalindrom("aba");

	}

}
