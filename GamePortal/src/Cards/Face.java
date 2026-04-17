package Cards;

import Game.Game;

public class Face extends CardType implements Game {

    public Face() {
        super("FaceCard");
    }

    @Override
    public String getDescription() {
        return "Card with face value (J, Q, K, A).";
    }
}

