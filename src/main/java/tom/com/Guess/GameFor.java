package tom.com.Guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int sum=0;
        for (int e = 1; e<11 ; e++){
            sum = sum + e;
        }//累加的運算
        System.out.println(sum);
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = 0;

                for(int i=1;i<4;i++) {
                number = scanner.nextInt();
                System.out.print("第"+i+"次");
                if(number == -1){
                    break;
                }
                if (number > secret) {
                    System.out.println("lower");
                } else if (number < secret) {
                    System.out.println("higher");
                } else {
                    System.out.println("you got it the number is " + secret);
                    break;
                }
            }
        }
    }

