package shivakumari;

public class CountAlphabetInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s1 = "She sells sea shells on sea shore";
				String s2 = "";
				char ch, ch1;
				s1 = s1.replaceAll("\\s+", "");
				s1=s1.toLowerCase();
				System.out.println("The trimmed string " + s1);
				for (int i = 0; i < s1.length(); i++) {
					int k = 0;
					ch = s1.charAt(i);
					if (!(s2.contains(Character.toString(ch)))) {
						s2 = s2 + ch;
						for (int j = 0; j < s1.length(); j++) {
							ch1 = s1.charAt(j);
							if (ch == ch1) {
								k++;
							}
						}
						System.out.println("The " + ch + " repeated " + k + " Times");
					}

				}

	}

}
