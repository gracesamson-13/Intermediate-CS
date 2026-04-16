import Game.Game;

public class Number extends CardType implements Game {


public Number() { 
    super("NumberType"); 
} 

@Override 
public String getDescription() { 
    return "Card with a numeric value (2–10)."; 
}

}
