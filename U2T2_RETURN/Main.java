import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // INIT CHATBOT
        ChatBot deborah = new ChatBot("Deborah", 8);
        Scanner scan = new Scanner(System.in);
        
        // MAIN CODE

        // GREETING
        System.out.println("What is your name? ");
        String userName = scan.nextLine();
        deborah.greeting(userName);

        // WEATHER
        System.out.println("Would you like to hear about the weather today? ");
        String response = scan.nextLine();
        if (response.equals("yes") || response.equals("Yes")){
            deborah.weather();

        }
        else{
            System.out.println("Ok then.");
        }
        // FEET TO METER
        System.out.println("How tall are you in feet?");
        int height = scan.nextInt();
        System.out.println("Wow, that's " + deborah.convertFeetToMeters(height) + " Meters! (Computers only use the metric system)");

        // FAV NUM
        System.out.println("What is your favorite number? ");
        int userFavoriteNum = scan.nextInt();
        scan.nextLine();
        deborah.favoriteNumber(userFavoriteNum);
        
        // ADD NUM
        System.out.println("Lets add some numbers, give me three numbers: ");
        System.out.println("NUM 1: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("NUM 2: ");
        int num2 = scan.nextInt();
        scan.nextLine();
        System.out.println("NUM 3: ");
        int num3 = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the sum of these 3 numbers? ");
        int sum = scan.nextInt();
        scan.nextLine();
        if (sum == deborah.addNumbers(num1, num2, num3)){
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong, it's " + deborah.addNumbers(num1, num2, num3));
        }

        // FAVORITE ANIMAL
        System.out.println("What's your favorite animal? ");
        String favAni = scan.nextLine();
        deborah.favoriteAnimal(favAni);

        // MONEY COUNTER
        System.out.println("How many quarters do you have? ");
        int quarters = scan.nextInt();
        scan.nextLine();
        System.out.println("How many dimes do you have? ");
        int dimes = scan.nextInt();
        scan.nextLine();
        System.out.println("How many nickels do you have? ");
        int nickels = scan.nextInt();
        scan.nextLine();
        System.out.println("How many pennies do you have? ");
        int pennies = scan.nextInt();
        scan.nextLine();
        System.out.println("You have $" + deborah.moneyCounter(quarters, dimes, nickels, pennies));



        // UNICORN NAME
        System.out.println("Let's find out your unicorn name! ");
        System.out.println("What is your name? (I forgot :( )");
        String newName = scan.nextLine();
        System.out.println(deborah.unicornName(newName));

        // EMOTIONS
        System.out.println("Are you feeling happy or sad today?");
        String emotion = scan.nextLine();
        deborah.talkAboutFeelings(emotion);

        // YEARS TO SECONDS
        System.out.println("How old are you? (Enter an integer)");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Wow! You're " + deborah.yearsToSeconds(age) + " seconds old!");

        // WORD REPEATER
        System.out.println("What's your favorite word?");
        String faveWord = scan.nextLine();
        System.out.println(deborah.wordRepeater(faveWord));
        System.out.println("That's what it would look like if someone repeated your word 100 times.");

        // GOODBYE
        System.out.println("Well, I have to go now.");
        System.out.println(deborah.goodbye());
        


    }
}
