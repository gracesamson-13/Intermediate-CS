package BuzzFeedQuiz;
import Game.Game;

public class Answer implements Game{
    String label;
    Category cat;
    
    // Constructor
    Answer(String label, Category c) {
        this.label = label; 
        this.cat = c;
    }
}
