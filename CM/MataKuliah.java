
public class MataKuliah {

    String kodeMk;
    String namaMk;
    int sks;

    public MataKuliah() {

    }

    public MataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;

    }

    public void dataSemuaMatkul() {
        System.out.println("==== DAFTAR MATA KULIAH ====");
        MataKuliah[] list = new MataKuliah[3];
        list[0] = new MataKuliah("MK001", "Struktur Data", 3);
        list[1] = new MataKuliah("MK002", "Basis Data", 3);
        list[2] = new MataKuliah("MK003", "Desain Web", 3);

        for (int i = 0; i < list.length; i++) {
            list[i].tampilMataKuliah();
        }
    }

    public void tampilMataKuliah() {
        System.out.println("Kode MK : " + kodeMk + "| Nama MK : " + namaMk + "| SKS : " + sks);
    }
}
