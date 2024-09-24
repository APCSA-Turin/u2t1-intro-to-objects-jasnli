public class ChatBot {

    // instance variables
    private String name;
    private int number;
 
    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }
 
    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }
 
    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }
 
    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }
 
    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }
 
    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
 
    // method that returns a goodbye message -- note that this method does not print a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }
    // JASON METHODS:
    public void favoriteAnimal(String animal) {
        if (animal.equals("bear")){
            System.out.println("That's my favorite animal too!");
        } else {
            System.out.println("I guess we can't be friends then :(");
        }
    }
        
    public double moneyCounter(int q, int d, int n, int p){
        double money = (q * 0.25) + (d * 0.1) + (n * 0.05) + (d + 0.01);
        return money;
    }
    public String unicornName(String userName){
        String uniName = userName + "ia Sparkles";
        return uniName;
    }

    
    // CORMAC METHODS:

    public void talkAboutFeelings(String userEmotion){
        if (userEmotion.equals("happy") || userEmotion.equals("Happy")){
            System.out.println("I'm glad your happy.");
        }
        else if (userEmotion.equals("sad") || userEmotion.equals("Sad")){
            System.out.println("I'm sorry.");
        }
        else{
            System.out.println("I'm not sure what you mean by that.");
        }
        System.out.println("Well, personally, I don't feel anything, because I'm a computer.");
        
    }

    public int yearsToSeconds(int years){
        return years * 31536000;
    }


    public String wordRepeater(String word){
        String output = "";
        int i = 0;
        while (i < 100) {
            output = output + word + "\n";
            i ++;
            
        }
        return output;
    }

}

 
 
 
 