
public class MahasiswaDemo18 {

    public static void main(String[] args) {
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        Mahasiswa18 m1 = new Mahasiswa18("123", "Zidan", "2A", 3.2);
        Mahasiswa18 m2 = new Mahasiswa18("124", "Ayu", "2A", 3.5);
        Mahasiswa18 m3 = new Mahasiswa18("125", "Sofi", "2A", 3.1);
        Mahasiswa18 m4 = new Mahasiswa18("126", "Sita", "2A", 3.9);
        Mahasiswa18 m5 = new Mahasiswa18("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        // System.out.println("Data Mahasiswa sebelum sorting: ");
        // // list.tampil();
        list.input();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        // Percobaan 3
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.SelectionSort();
        list.tampil();

        // Percobaan 4
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.InstertionSort();
        list.tampil();
        // Pertanyaan Percobaan 4
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.InstertionSort();
        list.tampil();

    }
}
