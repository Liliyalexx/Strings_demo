package eg1;

public class CharacterClassDemo {
	public static void main (String[]args) {
		String s =" !@#1 ADFFSfjkdhsfk 231A$'2 L3";
		
		int alpha=0;
		for (int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alpha++;
				
			}
			System.out.println("Total alpha count: "+alpha);
		}
	}

}
