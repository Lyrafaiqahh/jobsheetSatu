import java.util.Scanner;

public class PrakPerulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Inputan NIM Lyra (15)");
        System.out.print("Input NIM: ");
        long nim = scanner.nextLong();
        // memakai long karena maksimum integer hanyalah 2147483647

        int n = (int) (nim % 100);

        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                // i genap
                System.out.print(i + " ");
            } else {
                // i ganjil, cetak *
                System.out.print("* ");
            }
        }
    }
}