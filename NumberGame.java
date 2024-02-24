import java.util.*;

class NumberGame {
    public static void main(String[] ab) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--->Enter your Name Player(First Name Only*):");
        String Name = sc.next();
        System.out.println("\nHello -->" + Name + "<--,\nWelcome to Number Guess Game\n\n ");
        System.out.println("-----------------------INSTRUCTIONS--------------------------");
        System.out.println(
                "|| #1.Basically You just Guess the Number Based on that System ||\n || will tell you that if your Guess Smaller or Larger than the ||\n || Correct Guess You can Guess until You Gets Correct Guess ||");
        System.out.println("\n|| #2.But there are limited Number of Moves with each level ||");
        System.out.println("-------------------------------------------------------------\n\n");
        System.out.println("--------------LEVELS---------------");
        System.out.println("Easy----->> 9 Moves");
        System.out.println("Medium--->> 6 Moves");
        System.out.println("Hard----->> 4 Moves");
        System.out.println("Asian---->> 3 Moves");
        System.out.println("------------------------------------\n\n");
        System.out.println("Choose the Level(In Int like 1/2/3/4)");
        System.out.println("#1.Easy\n#2.Medium\n#3.Hard\n#4.Asian\n\n");
        int Level1 = sc.nextInt();
        int LevelAttempts = CLevel(Level1);
        // int Level = sc.nextInt();

        System.out.println("Lets Go -->" + Name + "<--... Good Luck & Have Fun Game");
        System.out.println("--                                      ");
        System.out.println("--------                                ");
        System.out.println("-----------------                       ");
        System.out.println("---------------------------             ");
        System.out.println("----------------------------------------");
        Game(LevelAttempts, Name, Level1);
    }

    static void Game(int Level, String Name, int Level1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--->Enter Your Guess Between(1-100):");
        // System.out.println("Level" + Level1);
        int UNum = sc.nextInt();
        int Min = 0;
        int Max = 100;
        int RAttempts=0;
        int STAttempts=Level;
        int TAttempts = Level;
        int Attempt = 1;
        int FAttempt=0;
        int Play = 0;
        int Round = 0, Score = 0;
        Random random = new Random();
        int RNum = random.nextInt((Max - Min + 1) + Min);
        // System.out.println("The Random Number:"+RNum);
        while (Play != 2) {
            if (TAttempts != 0) {
                if (RNum != UNum) {
                    if (UNum < RNum) {
                        System.out.println("\nYour Guess is Smaller than the correct Guess...");
                        System.out.println("--->Enter your Guess Again:");
                        UNum = sc.nextInt();
                        Attempt++;
                        TAttempts--;
                        System.out.println("You have " + TAttempts + " Moves Left.... Make Us Proud");
                    } else if (UNum > RNum) {
                        System.out.println("\nYour Guess is Larger than the correct Guess...");
                        System.out.println("---.Enter your Guess Again:");
                        UNum = sc.nextInt();
                        Attempt++;
                        TAttempts--;
                        System.out.println("You have " + TAttempts + " Moves Left.... Make Us Proud");
                    } else {
                        System.out.println("\nThere is some Error (The guess should be in between 0-100) ");
                        Attempt++;
                        TAttempts--;
                        System.out.println("You have " + TAttempts + " Moves Left.... Make Us Proud");
                    }
                } else {
                    System.out.println("\nCongratulations " + Name + " .. You have guessed it right!!! ");
                    System.out.println("--->With in Total " + Attempt + " Attempts\n");
                    RAttempts=STAttempts-Attempt;
                    Round++;
                    Score=Score+TScore(FAttempt,Round, Level1,RAttempts);
                    System.out.println(Name + " Your Total Rounds= " + Round + " & Score=" + Score);
                    System.out.println("Do You Want Go for Next Round?(Enter the Correct Int)");
                    System.out.println("1.Yesh,Let's Go\n2.No,Abort it");
                    Play = sc.nextInt();
                    if (Play == 1) {
                        Game(Level, Name, Level1);
                    } else {
                        System.exit(RNum);
                    }
                }
            } else {
                System.out.println("\n" + Name + " you are out of Moves......\n Do Your Best Next Time");
                // System.out.println("The Number was=" + RNum);
                Round++;
                FAttempt++;
                RAttempts=STAttempts-Attempt;
                Score=Score+TScore(FAttempt,Round, Level1,RAttempts);
                System.out.println(Name + " Your Total Rounds= " + Round + " & Score=" + Score);
                System.out.println("Do You Want Go for Next Round?(Enter the Correct Int)");
                System.out.println("1.Yesh,Let's Go\n2.No,Abort it");
                Play = sc.nextInt();

                if (Play == 1) {
                    Game(Level, Name, Level1);

                } else {
                    System.exit(RNum);
                }
            }

        }
    }

    static int CLevel(int Level) {
        int Moves = 0;
        if (Level == 1) {
            Moves = 9;
        } else if (Level == 2) {
            Moves = 6;
        } else if (Level == 3) {
            Moves = 4;
        } else if (Level == 4) {
            Moves = 3;
        } else {
            System.out.println("Enter the Correct Level No. in Int");
        }
        return Moves;

    }

    static int TScore(int FAttempt,int Round, int Level1,int RAttempts) {
        int Score = 0;
        if (Level1 == 1) {
            Score = Round * 100+RAttempts*5+1-FAttempt*20;

        }
        if (Level1 == 2) {
            Score = Round * 110+RAttempts*10+2-FAttempt*20;

        }
        if (Level1 == 3) {
            Score = Round * 120+RAttempts*15+5-FAttempt*20;

        }
        if (Level1 == 4) {
            Score = Round * 130+RAttempts*20+10-FAttempt*20;

        }
        return Score;

    }

}