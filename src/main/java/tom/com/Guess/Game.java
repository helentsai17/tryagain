package tom.com.Guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.print("The number you guess is? ");
            number = scanner.nextInt();
            if(number>secret){
                System.out.println("lower");
            }else if(number<secret){
                System.out.println("higher");
            }else {
                System.out.println("you got it, the number is "+ secret);
            }
        }
    }
}
