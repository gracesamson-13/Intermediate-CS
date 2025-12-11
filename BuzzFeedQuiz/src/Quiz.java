import java.util.Scanner;

public class Quiz {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
                // Categories for answers
                Category Brainrotted0 = new Category("6% Brainrotted",
                                "You are pretty normal and aren't infected by social media! Yet.. But everyone has a little brainrot in their system.");
                Category Brainrotted25 = new Category("41% Brainrotted", 
                                "You're scratching the surface of brainrot. Good start! I look forward to your true awakening.");
                Category Brainrotted75 = new Category("67% Brainrotted",
                                "I like how you think! You're a good example of Gen Z. I love this for you lil slime :)");
                Category Brainrotted100 = new Category("99.9% Brainrotted", 
                                "YOU'RE SO TUFF BROTHER NOAH KHABY-LAME MECHANISM GOD 6741 AHHHHH. But on another note, please get off your phone right now.");


                // Questions and possible answers
                Question q1 = new Question("Which one of these dances do you most identify with?");
                q1.possibleAnswers[0] = new Answer("Cotton Eye Joe", Brainrotted0);
                q1.possibleAnswers[1] = new Answer("Griddy", Brainrotted25);
                q1.possibleAnswers[2] = new Answer("Babyboo", Brainrotted75);
                q1.possibleAnswers[3] = new Answer("Brother Noah", Brainrotted100);

                Question q2 = new Question("How long do you usually spend on your phone each day?");
                q2.possibleAnswers[0] = new Answer("What phone?", Brainrotted0);
                q2.possibleAnswers[1] = new Answer("Like an hour", Brainrotted25);
                q2.possibleAnswers[2] = new Answer("Idk like 2-3 hours", Brainrotted75);
                q2.possibleAnswers[3] = new Answer("My phone is my bae", Brainrotted100);

                  Question q3 = new Question("Out of these apps, which is the best social media platform?");
                q3.possibleAnswers[0] = new Answer("FaceBook", Brainrotted0);
                q3.possibleAnswers[1] = new Answer("Instagram", Brainrotted25);
                q3.possibleAnswers[2] = new Answer("TikTok", Brainrotted75);
                q3.possibleAnswers[3] = new Answer("Reddit", Brainrotted100);

                 Question q4 = new Question("Which word is your favorite to address someone?");
                q4.possibleAnswers[0] = new Answer("Man", Brainrotted0);
                q4.possibleAnswers[1] = new Answer("Bro", Brainrotted25);
                q4.possibleAnswers[2] = new Answer("Boi", Brainrotted75);
                q4.possibleAnswers[3] = new Answer("Son", Brainrotted100);
                
                 Question q5 = new Question("Your favorite athlete just did horrible in a game! How do you vent your frustrations?" );
                q5.possibleAnswers[0] = new Answer("Deal with it", Brainrotted0);
                q5.possibleAnswers[1] = new Answer("Instagram", Brainrotted25);
                q5.possibleAnswers[2] = new Answer("ChatGPT", Brainrotted75);
                q5.possibleAnswers[3] = new Answer("ViggleAi", Brainrotted100);

                 Question q6 = new Question("Which great internet beef did you participate in during 2021?");
                q6.possibleAnswers[0] = new Answer("Uhh what?", Brainrotted0);
                q6.possibleAnswers[1] = new Answer("Floptropica VS The Bois", Brainrotted25);
                q6.possibleAnswers[2] = new Answer("Kumalala VS Savesta", Brainrotted75);
                q6.possibleAnswers[3] = new Answer("Jittleyang VS Fuhuhluhtoogan", Brainrotted100);

                Question q7 = new Question("Which artist do you prefer the most?");
                q7.possibleAnswers[0] = new Answer("Michael Jackson ofc, a classic.", Brainrotted0);
                q7.possibleAnswers[1] = new Answer("Queen Taylor Swift!", Brainrotted25);
                q7.possibleAnswers[2] = new Answer("Kendrick Lamar (hint: no you don't.)", Brainrotted75);
                q7.possibleAnswers[3] = new Answer("2Hollis, I'm a poster boy", Brainrotted100);

                 Question q8 = new Question("How do you best describe yourself when being successfully studious?");
                q8.possibleAnswers[0] = new Answer("On fire", Brainrotted0);
                q8.possibleAnswers[1] = new Answer("Academic weapon", Brainrotted25);
                q8.possibleAnswers[2] = new Answer("Locked in", Brainrotted75);
                q8.possibleAnswers[3] = new Answer("Flowstate achieved", Brainrotted100);

                 Question q9 = new Question("BONUS: Do you like to watch Minecraft Reddit AITA Storytimes?");
                q9.possibleAnswers[0] = new Answer("Um No?", Brainrotted0);
                q9.possibleAnswers[1] = new Answer("I dabble in it", Brainrotted25);
                q9.possibleAnswers[2] = new Answer("Yeah those are interesting!", Brainrotted0);
                q9.possibleAnswers[3] = new Answer("I hate everyone who doesn't post a part 2.", Brainrotted100);

             
                gameIntro();
                Question[] qList = { q1,q2,q3,q4,q5,q6,q7,q8,q9 };
                for (Question q : qList) {
                        Category c = q.ask(sc);
                        c.points++;
                }
                
                Category[] cList = { Brainrotted0, Brainrotted25, Brainrotted75, Brainrotted100 };
                int index = getMostPopularCatIndex(cList);
                System.out.println("ON THE CHRONICALLY ONLINE SPECTRUM, YOU ARE: " + cList[index].label + "!!!!");
                System.out.println(cList[index].description);

        }

        public static void gameIntro() {
                // requires 67 to keep going
                System.out.println("How Chronically Online Are You?");
                System.out.println("Choose numbers 1-4 for every question that you most identify with. Enter '67' to start!");
                float play = sc.nextInt();
                if (play != 67) {
                        System.out.println("I'LL GIVE YOU ONE MORE CHANCE. PLEASE PRESS '67' TO START.");
                        gameIntro();
                }
        }

        public static int getMostPopularCatIndex(Category[] counts) {
                int maxCount = 0;
                int maxIndex = 0;
                for (int i = 0; i < counts.length; i++) {
                        if (counts[i].points > maxCount) {
                                maxCount = counts[i].points;
                                maxIndex = i;
                        }
                }
                return maxIndex;
        }
}
