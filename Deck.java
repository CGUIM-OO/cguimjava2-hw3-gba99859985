import java.util.ArrayList;

class Deck {

	int randnum = 0;
	private ArrayList<Card> cards;
	public int nUsed;
	private ArrayList<Card> usedCard;

	// TODO: Please implement the constructor (30 points)

	public Deck(int nDeck) {
		usedCard = new ArrayList<Card>();//�ιL���d
		cards = new ArrayList<Card>();
		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y <= 13; y++) { // 13�i�d
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
		nUsed = nUsed + 1;                            //�ιL���P
		return cards.get(randnum);
	}

	public void shuffle() {
		randnum = (int) (Math.random() * cards.size());//�ü�
		usedCard.add(cards.get(randnum));              //�ιL���d����üƪ��쪺�d
		cards.remove(randnum);                         //�����ιL���d�קK����
		if (cards.size() == 0)                         //���W�S�P�F���]usedCard
			usedCard.removeAll(usedCard);
		cards.get(randnum);
	}
}