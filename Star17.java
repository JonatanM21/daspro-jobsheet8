import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan Nilai n =");
        int n = Jonatan.nextInt();

        for (int i = 2; i <= n; i += 2) {
        System.out.print(i + " ");
            Jonatan.close();
        }
    }
}