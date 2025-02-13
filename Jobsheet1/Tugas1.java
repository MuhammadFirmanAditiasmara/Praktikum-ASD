
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'T'};
        String KOTA[] = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "PATI",
            "SURABAYA",
            "TEGAL"
        };

        System.out.print("Masukkan kode plat nomor: ");
        char code = input.next().charAt(0);
        input.close();

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (code == KODE[i]) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
