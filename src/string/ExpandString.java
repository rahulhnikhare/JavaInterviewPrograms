package string;

// Java implementation of the approach
public class ExpandString {

	// Function to expand and print the given string
	static void expandString(String strin)
	{
		String temp = "";
		int j;

		for (int i = 0; i < strin.length(); i++) {
			//if (strin.charAt(i) >= 0) {
			if (Character.isDigit(strin.charAt(i) )) {

				// Subtract '0' to convert char to int
				int num = strin.charAt(i) - '0';
				if (strin.charAt(i + 1) == '(') {

					// Characters within brackets
					for (j = i + 1; strin.charAt(j) != ')'; j++) {
						if ((strin.charAt(j) >= 'a'
							&& strin.charAt(j) <= 'z')
							|| (strin.charAt(j) >= 'A'
								&& strin.charAt(j) <= 'Z')) {
							temp += strin.charAt(j);
						}
					}

					// Expanding
					for (int k = 1; k <= num; k++) {
						System.out.print(temp);
					}

					// Reset the variables
					num = 0;
					temp = "";
					i = j; // ***IMP
//					if (j < strin.length()) {
//						i = j; // IMP
//					}
				}
			} else {
				System.out.print(strin.charAt(i));
			}
		}
	}

	// Driver code
	public static void main(String args[])
	{
		String strin = "xyz2(bc)2(de)";// "3(ab)4)";
		expandString(strin);
	}
}
