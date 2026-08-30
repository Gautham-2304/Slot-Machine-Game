import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] symbols = {"A", "B", "C", "X", "O"};

        double balance = 100.0;
        double bet;
        double prize;

        String machine[] = new String[3];

        boolean play = true;

        System.out.println("*************************");
        System.out.println("Welcome to Slot machine");
        System.out.println("*************************");
        System.err.println("All the available symbols are: ");
        System.err.println(Arrays.toString(symbols));
        System.out.println("*************************");
        System.out.println("Your Balance: " +balance);
        
        do {
            if(balance<=0){
                System.out.println("Balance is not Sufficient!!");
                System.out.println("*************************");
                break;
            }
            for (int i = 0; i < 3; i++) {
                machine[i] = symbols[rand.nextInt(symbols.length)];
            }
            
            System.out.println("*************************");
            
            System.out.print("Enter your Bet: ");
            bet = sc.nextDouble();
            if(bet>0 && bet<=balance){
                balance -= bet;
            }
            else{
                System.out.println("Enter valid Bet!!");
                System.out.println("Bet should be greater than 0 and less than our equals to your Balance.");
                continue;
            }
            
            System.out.println("*************************");
            for (String sym : machine){
                System.out.print(sym+ " ");
            }
            System.out.println();
            
            if (machine[0] == machine[1] && machine[1] == machine[2]){
                System.out.println("You Win!!");
                prize = match3(bet, machine[1]);
                balance += prize;
                System.out.print("Prize money: " +prize);
                System.out.println();
            }
            else if (machine[0] == machine[1] || machine[1] == machine[2]){
                System.out.println("You Win!!");
                prize = match2(bet, machine[1]);
                balance += prize;
                System.out.print("Prize money: " +prize);
                System.out.println();
            }
            else{
                System.out.println("You Lose!!");
                System.out.println("Better luck next time!!");
            }
            
            System.out.println("Your Balance: " +balance);
            System.out.println("*************************");
            
            System.err.print("Do you want to play again[1 for yes / 0 for no]: ");
            
            if (sc.nextInt() == 0){
                System.err.println("Thanks for playing!!");
                System.out.println("*************************");
                play = false;
            }
        }
        while(play == true);

        sc.close();
    }

    static double match3 (double bet, String symbol){
        switch (symbol) {
            case "A" -> {
                bet *= 4;
            } 
            case "B" -> {
                bet *= 6;
            } 
            case "C" -> {
                bet *= 8;
            } 
            case "X" -> {
                bet *= 10;
            } 
            case "O" -> {
                bet *= 20;
            }
        }
        return bet; 
    }

    static double match2 (double bet, String symbol){
        switch (symbol) {
            case "A" -> {
                bet *= 2;
            } 
            case "B" -> {
                bet *= 3;
            } 
            case "C" -> {
                bet *= 4;
            } 
            case "X" -> {
                bet *= 5;
            } 
            case "O" -> {
                bet *= 10;
            }
        }
        return bet; 
    }
    
}