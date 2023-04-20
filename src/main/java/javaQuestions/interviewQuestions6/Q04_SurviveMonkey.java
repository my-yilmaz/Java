package javaQuestions.interviewQuestions6;

public class Q04_SurviveMonkey {
    /*
    TODO: There is a lonely monkey in the island
          He needs to eat 4 bananas every day
          there are just 165 bananas in that island
          Create following variables and find how many days
          monkey can survive.
          Use do while loop, increment and decrement and if statements
          int numberOfBananas =165, survivalDays = 1;
          boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;
        do {
            System.out.println("Gün " + (survivalDays + 1) + ":");
            System.out.println("Maymun 4 muz yiyor.");
            numberOfBananas -= 4;
            if (numberOfBananas < 0) {
                monkeyAlive = false;
                break;
            }
            System.out.println("Adada " + numberOfBananas + " muz kaldı.");
            survivalDays++;
        } while (numberOfBananas > 0 && monkeyAlive);
        if (monkeyAlive) {
            System.out.println("Maymun " + survivalDays + " gün hayatta kaldı.");
        } else {
            System.out.println("Maymun açlıktan öldü.");
        }
    }
}