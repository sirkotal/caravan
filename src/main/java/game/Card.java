package game;

import java.util.regex.*;

public class Card {
    private boolean face;
    private int value;
    private final String id;
    private final String suit;

    Card(String id, String suit) {
        this.id = id;
        this.suit = suit;
        setCard(this.id);
    }

    private void setCard(String id) {
        String regex = "10|[2-9]";

        if (id.matches(regex)) {
            try {
                this.value = Integer.parseInt(id);
            }
            catch (NumberFormatException e) {
                this.value = -1;
            }
            this.face = false;
        }
        else {
            this.face = true;
            if (id.equals("ace")) {
                this.value = 1;
            }
            else {
                this.value = 0;
            }
        }
    }

    public boolean isFace() {
        return face;
    }

    public int getValue() {
        return value;
    }

    public String getID() {
        return id;
    }

    public String getSuit() {
        return suit;
    }
}
