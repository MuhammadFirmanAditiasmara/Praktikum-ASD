import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int matkul = input.nextInt();                                                                                                                                                                                                                                                                                                                            
        input.nextLine(); 
        
        String[] namaMataKuliah = new String[matkul];
        int[] sks = new int[matkul];
        int[] semester = new int[matkul];
        String[] hari = new String[matkul];
        
        inputMataKuliah(input, matkul, namaMataKuliah, sks, semester, hari);
        
        while (true) {
            tampilkanMenu();
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hari, matkul);
                    break;
                case 2:
                    tampilkanJadwalBerdasarkanHari(input, namaMataKuliah, sks, semester, hari, matkul);
                    break;
                case 3:
                    tampilkanJadwalBerdasarkanSemester(input, namaMataKuliah, sks, semester, hari, matkul);
                    break;
                case 4:
                    cariMataKuliah(input, namaMataKuliah, sks, semester, hari, matkul);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void inputMataKuliah(Scanner scanner, int n, String[] nama, int[] sks, int[] semester, String[] hari) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            nama[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hari[i] = scanner.nextLine();
        }
    }

    public static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan seluruh jadwal");
        System.out.println("2. Tampilkan jadwal berdasarkan hari");
        System.out.println("3. Tampilkan jadwal berdasarkan semester");
        System.out.println("4. Cari mata kuliah berdasarkan nama");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari, int n) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        tampilkanHeaderTabel();
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(Scanner scanner, String[] nama, int[] sks, int[] semester, String[] hari, int n) {
        System.out.print("Masukkan hari kuliah: ");
        String cariHari = scanner.nextLine();
        boolean ditemukan = false;

        System.out.println("\nJadwal Kuliah pada " + cariHari + ":");
        tampilkanHeaderTabel();
        for (int i = 0; i < n; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(Scanner scanner, String[] nama, int[] sks, int[] semester, String[] hari, int n) {
        System.out.print("Masukkan semester: ");
        int cariSemester = scanner.nextInt();
        boolean ditemukan = false;

        System.out.println("\nJadwal Kuliah Semester " + cariSemester + ":");
        tampilkanHeaderTabel();
        for (int i = 0; i < n; i++) {
            if (semester[i] == cariSemester) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + cariSemester + ".");
        }
    }

    public static void cariMataKuliah(Scanner scanner, String[] nama, int[] sks, int[] semester, String[] hari, int n) {
        System.out.print("Masukkan nama mata kuliah: ");
        String cariNama = scanner.nextLine();
        boolean ditemukan = false;

        tampilkanHeaderTabel();
        for (int i = 0; i < n; i++) {
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void tampilkanHeaderTabel() {
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------------------");
    }
}
