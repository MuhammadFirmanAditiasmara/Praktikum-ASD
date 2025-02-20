public class MataKuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18(null, null, 0, 0);
        mk1.kodeMk = "KTI";
        mk1.nama = "Konsep Teknologi Informasi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();
        
        MataKuliah18 mk2 = new MataKuliah18 ("KTI", "Konsep Teknologi Informasi", 2, 4);
        mk2.tampilkanInformasi();
    }
}
