
import java.util.Scanner;

public class MahasiswaBerprestasi18 {

    Scanner scan = new Scanner(System.in);
    Mahasiswa18[] listMhs = new Mahasiswa18[5];
    int idx;

    void tambah(Mahasiswa18 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    // Modifikasi Pertanyaan
    void input() {
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            listMhs[i] = new Mahasiswa18();
            System.out.print("NIM\t: ");
            listMhs[i].nim = scan.next();
            System.out.print("Nama\t: ");
            listMhs[i].nama = scan.next();
            System.out.print("Kelas\t: ");
            listMhs[i].kelas = scan.next();
            System.out.print("IPK\t: ");
            listMhs[i].ipk = scan.nextDouble();
            
            
        }
    }

    void tampil() {
        for (Mahasiswa18 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    // Percobaan 3
    void SelectionSort() {
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa18 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // Percobaan 4
    void InstertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
            // modifikasi pertanyaan DESC
            // while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
