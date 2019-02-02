package tom.com.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
//方法二        int max = (english>math)?english:math;
//  /方法一      if (english>math){
//            max=english;
//        }else{
//            max=math;
        //}
        return (english > math) ? english : math;
    }

    public int getAverage() {
        return (english + math) / 2;
    }

    public void print() {
        int average = getAverage();
        System.out.println(name + " " + english + " " + math + " " + getAverage()
                + ((getAverage() >= 60) ? " pass" : " failed"));
//        if (getAverage()>=60){
//            System.out.println("\tpass");
//        }else {
//            System.out.println("\tfailed");
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading ='A';
                break;
            case 8:
                grading ='B';
                break;
            case 7:
                grading ='C';
                break;
            case 6:
                grading ='D';
                break;
                default:
                    grading='F';


        }
//        if (average >= 90 && average < 100) {
//            grading = 'A';
//        } else if (average >= 80 && average < 90) {
//            grading = 'B';
//        } else if (average >= 70 && average < 80) {
//            grading ='C';
//        }else if (average>=60 && average<70){
//            grading ='D';
//        }else {
//            grading ='F';
//        }
        System.out.println(" "+grading);
    }
}
