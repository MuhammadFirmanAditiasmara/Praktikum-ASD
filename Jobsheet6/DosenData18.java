
import java.util.Scanner;

public class DosenData18 {

    Scanner scan = new Scanner(System.in);
    Dosen18[] listDosen = new Dosen18[10];
    int idx;

    void tambah(Dosen18 dsn) {

        if (idx >= listDosen.length) {
            System.out.println("Data telah penuh, tidak dapat menambahkan lebih banyak dosen.");
            return;
        }
        listDosen[idx++] = dsn;
        System.out.println("Dosen berhasil ditambahkan!");
    }

    void input() {
        for (int i = 0; i < listDosen.length; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            listDosen[i] = new Dosen18();
            System.out.print("Kode\t\t\t: ");
            listDosen[i].kode = scan.next();
            System.out.print("Nama\t\t\t: ");
            listDosen[i].nama = scan.next();
            scan.nextLine();
            System.out.print("Jenis Kelamin(L/P)\t: ");
            String jk = scan.next();
            listDosen[i].jenisKelamin = jk.equalsIgnoreCase("L");
            System.out.print("Umur\t\t\t: ");
            listDosen[i].umur = scan.nextInt();

        }
    }

    void tampil() {
        for (Dosen18 dsn : listDosen) {
            dsn.tampil();
            System.out.println("-------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].umur < listDosen[j - 1].umur) {
                    Dosen18 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;

                }

            }

        }
    }

    void SortingDSC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].umur > listDosen[j - 1].umur) {
                    Dosen18 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;

                }

            }

        }

    }
}
