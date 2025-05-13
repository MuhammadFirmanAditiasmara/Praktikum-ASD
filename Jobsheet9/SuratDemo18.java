
import java.util.Scanner;

public class SuratDemo18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat18 surat = new StackSurat18(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    Surat18 srt = new Surat18(id, nama, kelas, jenis, durasi);
                    surat.push(srt);
                    System.out.printf("Surat %s berhasil diterima\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat18 diproses = surat.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat18 lihat = surat.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikirimkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    Surat18 ditemukan = surat.cariSurat(cari);
                    if (ditemukan != null) {
                        System.out.println("Surat ditemukan:");
                        System.out.println("ID Surat: " + ditemukan.idSurat);
                        System.out.println("Nama Mahasiswa: " + ditemukan.namaMahasiswa);
                        System.out.println("Kelas: " + ditemukan.kelas);
                        System.out.println("Jenis Izin: " + (ditemukan.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi Izin: " + ditemukan.durasi + " hari");
                    } else {
                        System.out.println("Tidak ada surat dari " + cari );
                    }
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid    ");
                    break;
            }
        } while (pilih >=1 && pilih <=4);
    }
}
