import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan Nilai n =");
        int n = Jonatan.nextInt();

        for(int i =1; i < n; i ++){
            System.out.print("*");
            Jonatan.close();
        }
    }
}