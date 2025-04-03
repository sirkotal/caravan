package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Caravan> caravans;
    private String name;
    private List<Card> deck;

    Player(String name) {
        this.caravans = new ArrayList<>();
        this.name = name;

        this.caravans.set(0, new Caravan());
        this.caravans.set(1, new Caravan());
        this.caravans.set(2, new Caravan());
    }

    public List<Caravan> getCaravans() {
        return this.caravans;
    }

    public String getPlayer() {
        return this.name;
    }

    public List<Card> getDeck() {
        return this.deck;
    }

    public boolean playCard(int caravan, int i, int... pos) {
        return this.caravans.get(caravan).addCard(this.deck.get(i - 1), pos[0]);
    }
}
