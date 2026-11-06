import java.util.Scanner;
public class Triangle17 {
    public static void main(String[] args) {
        Scanner Jonatan = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = Jonatan.nextInt();

        int i = 0;
 
        while (i <= n) {
            System.out.print("[i=" + i + "] ");
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        Jonatan.close();
    }
    
}
