package cards;

import cards.Card;

public class Deck {
    protected Card[] cards;
    public static final String[] SUIT = {
        "Diamond" , "Spade" ,"Heart" , "Clubs"
    };

    public static final String[] NAME ={
        "Ace", "Two", "Three","Four", 
        "Five","Six","Seven","Eight","Nine",
        "Ten","Jack","Queen","King"
    };

    public static final int[] VALUE = {
        1, 2, 3, 4, 
        5, 6, 7, 8, 9, 
        10, 10, 10, 10
    };


    public Deck(){
        int idx = 0;
        cards = new Card[52];
        for (String suit : SUIT){
            for(int i = 0 ; i < NAME.length; i++){
                String name = NAME[i];
                int value = VALUE[i];
                Card card = new Card(suit,name,value);
                cards[idx] = card;
                idx++;
            }
        }

    }

    public Card get(){
        return this.cards[0];
    }

    public Card get(int i) {
        return this.cards[i];
    }
}
