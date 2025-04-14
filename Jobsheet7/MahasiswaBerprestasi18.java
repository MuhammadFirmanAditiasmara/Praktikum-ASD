
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

    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);

        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
