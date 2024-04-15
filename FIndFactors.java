import java.util.Scanner;

public class FIndFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                if (i == 1 && i == num && num % i == 0 && num % num == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
