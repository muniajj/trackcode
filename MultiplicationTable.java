import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i);
            System.out.println();
        }
    }
    
}
