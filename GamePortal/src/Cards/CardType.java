package Cards;

import Game.Game;

public class CardType implements Game {
    String name;

    public CardType(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Card type";
    }
}