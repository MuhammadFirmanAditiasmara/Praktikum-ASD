import java.util.Scanner;

public class LayananKRS {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS18 antrian = new AntrianKRS18 (10);
        int pilih;

        do {
            System.out.println("\nMENU ANTRIAN KRS:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Diproses");
            System.out.println("8. Cetak Mahasiswa Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.memanggilAtrian();
                    break;
                case 3:
                    antrian.tampilSemua();
                    break;
                case 4:
                    antrian.tampilDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilAkhir();
                    break;
                case 6:
                    antrian.cetakJumlahAntrian();
                    break;
                case 7:
                    antrian.cetakJumlahDiproses();
                    break;
                case 8:
                    antrian.cetakBelumDiproses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

