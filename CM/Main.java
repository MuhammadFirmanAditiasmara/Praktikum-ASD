
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa();
        MataKuliah data2 = new MataKuliah();
        Penilaian data3 = new Penilaian();
        
        Scanner input = new Scanner(System.in);
        int menu;
        while (true) {

            System.out.println("==== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah ");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilih Menu : ");
            menu = input.nextInt();

            if (menu == 1) {
                data.dataSemuaMahasiswa();
                System.out.println();
            } else if (menu == 2) {
                data2.dataSemuaMatkul();
                System.out.println();
            } else if (menu == 3) {
                data3.dataUnsorted();
                System.out.println();
            } else if (menu == 4) {
                data3.SelectionSort();
            } else if (menu == 5) {
                Mahasiswa.cariNim(data);
            } else if (menu == 6) {
                data3.updateNilai();
            } else if (menu == 0) {
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("Menu Tidak Valid, Masukkan kembali menu denagan benar!");
            }
            
        }
    }
}
