/**
 * PrintSq1
 */
public class PrintSq1 {

    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (n>=i) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1);
                j++;
            }
            i++;
            System.out.println();

        }
        
        
    }
}