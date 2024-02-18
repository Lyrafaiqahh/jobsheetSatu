import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] KODE = new char[10];
        char[][] KOTA = new char[10][12];

        // Inisialisasi array 
        KODE[0] = 'A'; KOTA[0] = "Banten".toCharArray(); // Memakai toCharArray karena mengubah nama kota Banten = String, menjadi char array
        KODE[1] = 'B'; KOTA[1] = "Jakarta".toCharArray();
        KODE[2] = 'D'; KOTA[2] = "Bandung".toCharArray();
        KODE[3] = 'E'; KOTA[3] = "Cirebon".toCharArray();
        KODE[4] = 'F'; KOTA[4] = "Bogor".toCharArray();
        KODE[5] = 'G'; KOTA[5] = "Pekalongan".toCharArray();
        KODE[6] = 'H'; KOTA[6] = "Semarang".toCharArray();
        KODE[7] = 'L'; KOTA[7] = "Surabaya".toCharArray();
        KODE[8] = 'N'; KOTA[8] = "Malang".toCharArray();
        KODE[9] = 'T'; KOTA[9] = "Tegal".toCharArray();

        System.out.println("~~ TUGAS PROGRAM PLAT NOMOR LYRA (15) ~~");
        System.out.println("\n=========================================");
        System.out.println("No.  Kode Plat Nomor     Nama Kota   ");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-5d%-20s%-15s\n", i + 1, KODE[i], String.valueOf(KOTA[i]));
        }
        System.out.print("\nInput kode plat nomor yang tersedia (huruf besar) : ");
        char kodeInput = scanner.next().charAt(0);

        int indeks = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                indeks = i; // memperbarui nilai indeks
                break;
            }
        }

        if (indeks != -1) {
            System.out.print("Kota untuk kode plat nomor " + kodeInput + " adalah ");
            for (int j = 0; j < KOTA[indeks].length; j++) {
                System.out.print(KOTA[indeks][j]);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

       
    }
}
