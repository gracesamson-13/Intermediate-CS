import java.util.Scanner;

public class Question {
    // Fields
    String label;
    Answer[] possibleAnswers = new Answer[4];

    Question(String label) {
        this.label = label;
    }

    // ask a question, and return the category that corresponds to the answer
    Category ask(Scanner sc) {
        System.out.println(this.label);
        // prints out all the answer choices
        for (int i = 0; i < this.possibleAnswers.length; i++) {
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:" +
                    this.possibleAnswers[i].label);
        }

boolean nextInt = sc.hasNextInt();
if (nextInt == false) {
    return null; 

} else {
    int ans = sc.nextInt();
    if (ans == 1 || ans == 2 || ans == 3 || ans == 4 || ans == 67) {
        return possibleAnswers[ans - 1].cat;
    } else {
        System.out.println("I DIDN'T APPROVE THIS ANSWER. NOW YOU HAVE TO START OVER.");
        return null; 
    }
}

}
}
