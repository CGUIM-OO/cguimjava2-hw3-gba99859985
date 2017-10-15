# CGUIMOOP_HW3


## From HW2.java 

- 將Card 和 Deck class取出，存成Card.java與Deck.java，並設成public
- 將Card.java, Deck.java 與HW3.java放在同一個資料夾，同一個JAVA project

## Card.java

- Use enumerated type in Card class:
    - Suit: Club, Diamond, Heart, Spade
- Add Method:
    - 修改Constructor，創建物件時，需要填入參數(Suit s, int value)
    - 修改public void printCard (); 範例：Spade 1
    - 因應Suit修改，原有getSuit(); 方法的return type 要修正


## Deck.java
- Add new Filed:
    - ArrayList<Card> usedCard; 
    - public int nUsed;

- Add new Method: 
    - public void shuffle() 洗牌，意指全部牌收回（不管發出去幾張），重新洗牌
        - 提示：隨機取一張牌牌，放到新的位置
        - Random rnd = new Random();    int j = rnd.nextInt(i + 1);
        - 重設usedCard, nUsed
    - public Card getOneCard() 發一張牌出來，回傳Card object
        - 要檢查沒牌了 (牌都發完了) 怎麼辦？ shuffle() ！
        - 發出去的牌紀錄在ArrayList<Card> usedCard
        - 發了幾張牌？紀錄在private int nUsed;
        - Deck constructor 在最後呼叫shuffle() method
    - 因應Card 的Constructor修改，有些Code 要更動
        - 提示： for (Card.Suit s : Card.Suit.values()){ }


