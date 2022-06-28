package ch04;

public class Prac4_4 {
    public static void main(String[] args) {

        int sum = 0;
while()
        for (int i = 1; ; i++) {

            if (i % 2 != 0) {
                sum = sum + i;
            } else {
                sum = sum - i;
            }
            if (sum >= 100) {

                System.out.println(i);
                break;
            }

        }
    }
}


