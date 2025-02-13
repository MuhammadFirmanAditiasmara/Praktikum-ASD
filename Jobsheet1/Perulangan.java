
import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long NIM;
        int n;
        System.out.println();
        System.out.print("Masukkan NIM : ");
        NIM = input.nextLong();

        n = (int) (NIM % 100);

        if (n < 10) {
            n += 10;
            System.out.println("n : " + n);
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            if (i % 2 != 0) {
                System.out.print("* ");
            }

        }
    }
}
