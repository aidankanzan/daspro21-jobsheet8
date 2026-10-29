import java.util.Scanner;

public class Tugas2No21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int jumlahSeluruhAngka = 0;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahSeluruhAngka += hasil;
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        sc.close();
    }
}