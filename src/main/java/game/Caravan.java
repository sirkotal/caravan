package game;

import java.util.*;

public class Caravan {
    private List<Card> caravan;
    private int value;
    private boolean ascending;
    private String suit;

    Caravan() {
        this.caravan = new ArrayList<>();
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public List<Card> getCaravan() {
        return this.caravan;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    public void setAscending(boolean bool) {
        this.ascending = bool;
    }

    public void addCard(Card card) {
        this.caravan.add(card);
        this.value += card.getValue();
    }
}
