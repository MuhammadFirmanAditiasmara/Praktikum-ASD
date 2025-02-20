public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 dosen1 = new Dosen18();

        dosen1.idDosen = "D001";
        dosen1.nama = "Muhammad Ali Farhan";
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pendidikan";
        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        
        dosen1.ubahKeahlian("Teknik Komputer");
        dosen1.tampilkanInformasi();

        Dosen18 dosen2 = new Dosen18("D002", "Kylian Mbappe", 2010, "Fisika");
        dosen2.hitungMasaKerja(2018);
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
    }
}
