import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("\n=======================================================================");
                    System.out.println("~~ Program menghitung rumus kecepatan,jarak dan waktu Lyra (15) ~~");
                    System.out.println("=========================================================================");
                    System.out.println("\n--- MENU ---");
                    System.out.println("Pilih salah satu yang ingin dihitung!");
                    System.out.println("1. Kecepatan || 2. Jarak || 3. Waktu || 4.Keluar");
                    System.out.print("Pilih menu : ");
                    int pilihan = scanner.nextInt();
        
                    switch (pilihan) {
                        case 1:
                            hitungKecepatan();
                            break;
                        case 2:
                            hitungJarak();
                            break;
                        case 3:
                            hitungWaktu();
                            break;
                        case 4:
                            System.out.println("Terima kasih!");
                            System.exit(0);
                        default:
                        System.out.println("===============================================");
                            System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                }
            }
        
            public static void hitungKecepatan() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan jarak (meter): ");
                double s = scanner.nextDouble();
                System.out.print("Masukkan waktu (detik): ");
                double t = scanner.nextDouble();
        
                double v = s / t;
                System.out.println("Kecepatan adalah " + v + " m/s");
            }
        
            public static void hitungJarak() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan kecepatan (m/s): ");
                double v = scanner.nextDouble();
                System.out.print("Masukkan waktu (detik): ");
                double t = scanner.nextDouble();
        
                double s = v * t;
                System.out.println("Jarak adalah " + s + " meter");
            }
        
            public static void hitungWaktu() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukkan jarak (meter): ");
                double s = scanner.nextDouble();
                System.out.print("Masukkan kecepatan (m/s): ");
                double v = scanner.nextDouble();
        
                double t = s / v;
                System.out.println("Waktu adalah " + t + " detik");
            }
        }
        