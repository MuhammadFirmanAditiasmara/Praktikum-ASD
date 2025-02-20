
public class MataKuliahMain18 {

    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma Struktur Data";
        mk1.ubahSKS(3);
        mk1.jumlahJam = 3;
        mk1.tambahJam(2);
        mk1.tampilInformasi();
        System.out.println();

        MataKuliah18 mk2 = new MataKuliah18("MK002", "Desain Antarmuka", 2, 4);
        mk2.tampilInformasi();
        System.out.println();
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(4);
        mk2.kurangiJam(3);
        System.out.println();
    }
}
