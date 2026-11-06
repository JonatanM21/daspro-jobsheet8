import java.util.Scanner;
public class Tugas317 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = Jonatan.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = Jonatan.nextInt();
        }

        int totalBarangSemuaToko = 0;
        int totalPelangganSemuaToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = Jonatan.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = Jonatan.nextInt();
            }

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j );
                int jumlahBarang = Jonatan.nextInt();

                while (jumlahBarang < 0) {
                    System.out.print("Jumlah barang pelanggan :" + j );
                    jumlahBarang = Jonatan.nextInt();
                }
                totalBarangToko += jumlahBarang;
            }

            totalPelangganSemuaToko += jumlahPelanggan;
            totalBarangSemuaToko += totalBarangToko;

            System.out.println(" Toko " + i +" pelanggan: " + jumlahPelanggan +", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = i;
            }
        }
        System.out.println("Total pelanggan seluruh toko: " + totalPelangganSemuaToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);
        
        Jonatan.close();
    }
}