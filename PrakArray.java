import java.util.Scanner;

public class PrakArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] namaMatakuliah = new String[9];
        String[] nilaiHuruf = new String[9];
        int[] bobotSKS = new int[9];

        String[] validNilaiHuruf = {"A", "B+", "B", "C+", "C", "D", "E"};
        
        System.out.println("Program menghitung IP Semester Lyra (15)");
        System.out.println("========================================================");
        for (int i = 0; i < 9; i++) {

            System.out.print("\nMasukkan nama mata kuliah ke-" + (i+1) + ": ");
            namaMatakuliah[i] = scanner.nextLine();

            String huruf;
            boolean validHuruf = false;
            do {
                System.out.print("Masukkan nilai huruf untuk mata kuliah " + namaMatakuliah[i] + ": ");
                huruf = scanner.nextLine().toUpperCase();
               
                for (String nilai : validNilaiHuruf) {
                    if (huruf.equals(nilai)) { 
                        validHuruf = true;
                        break;
                    }
                }
                if (!validHuruf) {
                    System.out.println("Nilai huruf tidak valid. Masukkan kembali.");
                }
            } while (!validHuruf);

            nilaiHuruf[i] = huruf;

            System.out.print("Masukkan bobot SKS untuk mata kuliah " + namaMatakuliah[i] + ": ");
            bobotSKS[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        double[] nilaiSetara = {4, 3.5, 3, 2.5, 2, 1, 0};
        double totalSKS = 0;
        for (int sks : bobotSKS) {
            totalSKS += sks;
        }
        
        double totalNilaiSetara = 0;
        for (int i = 0; i < 9; i++) {
            totalNilaiSetara += nilaiSetara[indexOf(validNilaiHuruf, nilaiHuruf[i])] * bobotSKS[i];
        }
        double ipSemester = totalNilaiSetara / totalSKS;
        
        System.out.println("\n\n========================================================");
        System.out.println("No.  Nama Mata Kuliah    Nilai Huruf    Bobot SKS");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 9; i++) {
            System.out.printf("%-5d%-20s%-15s%-10d\n", i+1, namaMatakuliah[i], nilaiHuruf[i], bobotSKS[i]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-26s%.2f\n", "Nilai IP Semester :", ipSemester);
        System.out.println("========================================================");
    }

 public static int indexOf(String[] array, String nilai) {
    for (int i = 0; i < array.length; i++) {
        if (array[i].equals(nilai)) {
            return i;
        }
    }
    return -1;
}
}
