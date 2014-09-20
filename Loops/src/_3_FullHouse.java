import java.util.Dictionary;

public class _3_FullHouse {

	public static void main(String[] args) {
		char[] suits = { '\u2660', '\u2665', '\u2666', '\u2663' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };

		Dictionary<String, Character> cards = new Dictionary<String, Character>();
		
		
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards.put(faces[i], suits[j]);
			}
		}

		for (int i = 0; i < cards.size(); i++) {
			for (int j = 0; j < cards.size(); j++) {
				for (int k = 0; k < cards.size(); k++) {
					for (int l = 0; l < cards.size(); l++) {
						for (int m = 0; m < cards.size(); m++) {
							
							String output= cards.
							
							
							
							System.out.printf("%s ", output);
						}
					}
				}

			}

		}

	}

	boolean isFullHouse() {
		return false;
	}
}
