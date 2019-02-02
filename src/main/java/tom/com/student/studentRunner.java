package tom.com.student;

import java.util.Scanner;

public class studentRunner {
    public static void main(String[] args) {
        Student stu = new Student("Hank",20,99);
        stu.print();
        System.out.println("Height score: "+stu.highest());

        //userInput();
    }

    private static void userInput() {
        System.out.print("Please enter student's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter english score:");
        int english = scanner.nextInt();
        System.out.print("Please enter math score:");
        int math = scanner.nextInt();

        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("Height score: "+stu.highest());
    }
}
