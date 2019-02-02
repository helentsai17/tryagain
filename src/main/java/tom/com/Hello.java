package tom.com;

public class Hello {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.charAt(3));//取的index值上的字元，從0開始
        System.out.println(s.length());//取的index的長度
        System.out.println(s.substring(2));//取得資料開始的數到最後
        System.out.println(s.substring(1,4));//取1開始的資料到4之前的資料
    }
}
