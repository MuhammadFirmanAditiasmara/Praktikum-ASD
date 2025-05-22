
import java.util.Scanner;

public class MahasiswaDemo18 {

    public static void main(String[] args) {
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        // Mahasiswa18 m1 = new Mahasiswa18("123", "Zidan", "2A", 3.2);
        // Mahasiswa18 m2 = new Mahasiswa18("124", "Ayu", "2A", 3.5);
        // Mahasiswa18 m3 = new Mahasiswa18("125", "Sofi", "2A", 3.1);
        // Mahasiswa18 m4 = new Mahasiswa18("126", "Sita", "2A", 3.9);
        // Mahasiswa18 m5 = new Mahasiswa18("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
        // // System.out.println("Data Mahasiswa sebelum sorting: ");
        // // // list.tampil();
        // list.input();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();
        // // Percobaan 3
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        // list.SelectionSort();
        // list.tampil();
        // // Percobaan 4
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.InstertionSort();
        // list.tampil();
        // // Pertanyaan Percobaan 4
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        // list.InstertionSort();
        // list.tampil();
        Scanner input = new Scanner(System.in);
// int jumMhs = 5;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine();
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = input.nextLine();
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Kelas   : ");
            String kelas = input.nextLine();
            System.out.print("IPK     : ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------------------");
            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        list.tampil();

        // melakukan pencarian data Sequential
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");

        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data Binary
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");

        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = input.nextDouble();

        System.out.println("-------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
