import java.util.Scanner;

public class Tugas117 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Jonatan.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);

        Jonatan.close();
    }
}