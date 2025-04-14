
import java.util.Scanner;

public class DosenData18 {

    Scanner scan = new Scanner(System.in);
    Dosen18[] listDosen = new Dosen18[3];
    int idx = 0;

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
            Dosen18 dsn = new Dosen18();
            System.out.print("Kode\t\t\t\t: ");
            dsn.kode = scan.next();
            System.out.print("Nama\t\t\t\t: ");
            dsn.nama = scan.next();
            scan.nextLine(); // Konsumsi newline
            System.out.print("Jenis Kelamin(L/P)\t\t: ");
            String jk = scan.next();
            dsn.jenisKelamin = jk.equalsIgnoreCase("L");
            System.out.print("Umur\t\t\t\t: ");
            dsn.umur = scan.nextInt();
            tambah(dsn);
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
            System.out.println("-------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listDosen[j].umur > listDosen[j + 1].umur) {
                    Dosen18 temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listDosen[j].umur < listDosen[j + 1].umur) {
                    Dosen18 temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }

    int PencarianDataSequential18(String cari) {
        for (int i = 0; i < idx; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    int PencarianDataBinary18(int cariUmur, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listDosen[mid].umur == cariUmur) {
                return mid;
            } else if (listDosen[mid].umur > cariUmur) {
                return PencarianDataBinary18(cariUmur, left, mid - 1);
            } else {
                return PencarianDataBinary18(cariUmur, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Data dosen dengan nama \"" + nama + "\" ditemukan pada data ke-" + (pos + 1));
        } else {
            System.out.println("Data dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    void tampilDataSearch(String cariNama, int pos) {

        if (pos != -1) {
            System.out.println("Data dosen ditemukan:");
            listDosen[pos].tampil();

        } else {
            System.out.println("Data dosen dengan nama \"" + cariNama + "\" tidak ditemukan.");
        }

    }

    void tampilPosisiBinary(int umur, int pos) {
        int jumlah = 0;

        if (pos != -1) {

            for (int i = 0; i < idx; i++) {
                if (listDosen[i].umur == umur) {
                    listDosen[i].tampil();
                    System.out.println("-------------------------");
                    jumlah++;
                }
            }

            if (jumlah > 1) {
                System.out.println("Ditemukan lebih dari satu dosen dengan umur tersebut sebanyak " + jumlah + " data.");
            } else {
                System.out.println("Ditemukan 1 data dosen dengan umur tersebut.");
            }

        } else {
            System.out.println("Data dosen dengan umur tersebut tidak ditemukan.");
        }
    }

    void tampilDataSearchBinary(int cariUmur, int pos) {
        if (pos != -1) {

        } else {
            System.out.println("Data dosen dengan Umur \"" + cariUmur + "\" tidak ditemukan.");
        }
    }
}
