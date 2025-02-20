public class MataKuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangiJam(2);

        MataKuliah18 mk2 = new MataKuliah18("MK002", "Desain Antar Muka", 2, 4);
        mk2.tampilInformasi();
    }
}
