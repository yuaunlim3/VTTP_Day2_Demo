package cards;

import cards.Deck;

public class Main2 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.get(5);
        System.out.println(card.toString());
    }
}
