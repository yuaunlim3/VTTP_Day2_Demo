package cards;

public class Card {
    private final String name;
    private final String suit;
    private final int value;

    //NO blank cards
    public Card(String suit, String name , int value){
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public String getName() {return name;}
    public String getSuit() {return suit;}
    public int getValue() {return value;}

    public String toString(){
        return String.format("SUIT: %s\n VALUE: %d\n NAME: %s",suit,value,name);
    }
    
}
