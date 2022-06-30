package ch04;

public class Prac4_9 {
    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + num % 10;
            System.out.println("sum = " + sum);
            num = num / 10;
            System.out.println(num);
        }
    }
}
