import java.util.Scanner;

public class Tugas3No21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko = 0;
        while (jumlahToko < 1) {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        }

        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 1;
        int maxBarang = -1;

        String ringkasanPerToko = "";

        int i = 1;
        while (i <= jumlahToko) {
            System.out.println("\n--- Toko " + i + " ---");

            int jumlahPelanggan = -1;
            while (jumlahPelanggan < 0) {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            }

            int totalBarangToko = 0;

            int j = 1;
            while (j <= jumlahPelanggan) {
                int barangDibeli = -1;
                while (barangDibeli < 0) {
                    System.out.print("  Masukkan jumlah barang pelanggan ke-" + j + ": ");
                    barangDibeli = sc.nextInt();
                    if (barangDibeli < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                }
                totalBarangToko += barangDibeli;
                j++;
            }

            ringkasanPerToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }

            i++;
        }

        // Tampilkan Ringkasan Output
        System.out.println("\n==================================");
        System.out.print(ringkasanPerToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}