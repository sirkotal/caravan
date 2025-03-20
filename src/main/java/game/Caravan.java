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

    public boolean addCard(Card card, int... pos) {
        Card lastCard = this.caravan.getLast();
        if (!card.isFace() || Objects.equals(card.getID(), "ace")) {
            if ((card.getValue() > lastCard.getValue() && ascending) || (card.getValue() < lastCard.getValue() && !ascending)) {
                this.caravan.add(card);
                this.value += card.getValue();
                setSuit(card.getSuit());
                return true;
            }
            else if (Objects.equals(card.getSuit(), lastCard.getSuit())) {
                this.caravan.add(card);
                this.value += card.getValue();
                setAscending((card.getValue() > lastCard.getValue()));
                return true;
            }
        }
        else {
            switch (card.getID()) {
                case "queen":
                    this.caravan.add(card);
                    setSuit(card.getSuit());
                    setAscending(!this.ascending);
                    return true;
                case "jack":
                    //TODO
                case "king":
                    this.caravan.add(pos[0], card);
                    this.value += this.caravan.get(pos[0] - 1).getValue();
                    setSuit(card.getSuit());
                    return true;
                case "joker":
                    //TODO
            }
        }
        return false;
    }
}
