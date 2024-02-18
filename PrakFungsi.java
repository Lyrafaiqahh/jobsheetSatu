public class PrakFungsi {
    
    static int[][] stockBunga = {
        {10, 5, 15, 7},  // RoyalGarden1
        {6, 11, 9, 12},  // RoyalGarden2
        {2, 10, 10, 5},  // RoyalGarden3
        {5, 7, 12, 9}    // RoyalGarden4
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

  
    public static void hitungPendapatan() {
        System.out.println("Program Tampil pendapatan dan jumlah stok bunga Lyra (15)");
        System.out.println("=================================");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("\n==== PENDAPATAN SETIAP CABANG ====");
            System.out.println("Pendapatan RoyalGarden" + (i+1) + ": Rp" + totalPendapatan);
        }
    }

    // menampilkan jumlah stok Royalgarden4
    public static void tampilkanStockRoyalGarden4() {
        System.out.println(" \n\n\n--- STOK BUNGA ROYAL GARDEN (SEBELUM PENGURANGAN) ---");
        System.out.println("Stok Bunga RoyalGarden4:");
        System.out.println("Aglonema: " + stockBunga[3][0]);
        System.out.println("Keladi: " + stockBunga[3][1]);
        System.out.println("Alocasia: " + stockBunga[3][2]);
        System.out.println("Mawar: " + stockBunga[3][3]);
    }

    //  menghitung stok akhir setiap jenis bunga di RoyalGarden4
    public static void hitungStokAkhirRoyalGarden4() {
        int[] penguranganStock = {-1, -2, 0, -5}; 
        int[] stokAkhir = new int[stockBunga[3].length];
        for (int i = 0; i < stockBunga[3].length; i++) {
            stokAkhir[i] = stockBunga[3][i] + penguranganStock[i];
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("--- STOK BUNGA ROYAL GARDEN4 (SETELAH PENGURANGAN) --- ");
        System.out.println("Aglonema: " + stokAkhir[0]);
        System.out.println("Keladi: " + stokAkhir[1]);
        System.out.println("Alocasia: " + stokAkhir[2]);
        System.out.println("Mawar: " + stokAkhir[3]);
    }

    public static void main(String[] args) {
        hitungPendapatan();
        tampilkanStockRoyalGarden4();
        hitungStokAkhirRoyalGarden4();
    }
}
