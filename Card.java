public class Card {
	private Suit suit;
	private int rank;
	int pai = 0;

	public enum Suit {
		Club, Diamond, Heart, Spade//四個花色
	}

	Suit s1 = Suit.Club;
	Suit s2 = Suit.Diamond;
	Suit s3 = Suit.Heart;
	Suit s4 = Suit.Spade;

	public Card(Suit s, int r) {
		suit = s;
		rank = r;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public void printCard() {
		// TODO Auto-generated method stub

		if (suit == s1)
			System.out.println("Club" + rank);
		else if (suit == s2)
			System.out.println("Diamond" + rank);
		else if (suit == s3)
			System.out.println("Heart" + rank);
		else if (suit == s4)
			System.out.println("Spade" + rank);

	}
}
