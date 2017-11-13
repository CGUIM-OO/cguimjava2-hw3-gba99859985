import java.util.ArrayList;

class Deck {

	int randnum = 0;
	private ArrayList<Card> cards;
	public int nUsed;
	private ArrayList<Card> usedCard;

	// TODO: Please implement the constructor (30 points)

	public Deck(int nDeck) {
		usedCard = new ArrayList<Card>();//用過的卡
		cards = new ArrayList<Card>();
		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y <= 13; y++) { // 13張卡
					Card card = new Card(s, y);
					cards.add(card);
				}
			}
		}
	}

	public void printDeck() {
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).printCard();
		}

	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public Card getOneCard() {
		shuffle();
		nUsed = nUsed + 1;                            //用過的牌
		return cards.get(randnum);
	}

	public void shuffle() {
		randnum = (int) (Math.random() * cards.size());//亂數
		usedCard.add(cards.get(randnum));              //用過的卡等於亂數的到的卡
		cards.remove(randnum);                         //移除用過的卡避免重覆
		if (cards.size() == 0)                         //當手上沒牌了重設usedCard
			usedCard.removeAll(usedCard);
		cards.get(randnum);
	}
}