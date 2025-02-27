
import java.util.Scanner;

public class MataKuliahDemo18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jmlMatkul = input.nextInt();
        input.nextLine();
        MataKuliah18[] arrayOfMataKuliah18 = new MataKuliah18[3];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah18[i] = new MataKuliah18();
            arrayOfMataKuliah18[i].tambahData(input);

        }

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah18[i].cetakInfo();
            
        }
    }
}
