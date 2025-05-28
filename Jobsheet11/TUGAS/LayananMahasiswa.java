package TUGAS;

import java.util.Scanner;

public class LayananMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianMahasiswa list = new AntrianMahasiswa();
        int pilihan;

        do {
            System.out.println("\nMENU LAYANAN UNIT KEMAHASISWAAN");
            System.out.println("1. Cek Antrian");
            System.out.println("2. Tambah Antrian");
            System.out.println("3. Panggil Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0-. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    if (!list.isFull()) {
                        System.out.println("Antrian Masih bisa ditambahkan");
                    } else {
                        System.out.println("Antrian Sudah penuh");
                    }
                    break;
                case 2:
                    if (!list.isFull()) {
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan NIM: ");
                        String nim = input.nextLine();
                        System.out.print("Masukkan kelas: ");
                        String kelas = input.nextLine();

                        Mahasiswa mhs = new Mahasiswa(nama, nim, kelas);
                        list.tambahAntrian(mhs);
                    } else {
                        System.out.println("Antrian sudah penuh");
                    }
                    break;
                case 3:
                    list.panggilAntrian();
                    break;
                case 4:
                    list.antrianTerdepan();
                    break;
                case 5:
                    list.antrianTerakhir();
                    break;
                case 6:
                    list.jmlAntrian();
                    break;
                case 7: 
                    list.clear();
                    break;
                case 0:
                    System.out.println("Program Selesai, Terima Kasih");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid");
            }

        } while (pilihan != 0);
    }
}
