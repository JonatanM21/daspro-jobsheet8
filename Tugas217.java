import java.util.Scanner;

public class Tugas217 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Jonatan.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.print( hasil + " ");

                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);

        Jonatan.close();
    }
}