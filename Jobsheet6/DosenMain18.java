
public class DosenMain18 {

    public static void main(String[] args) {
        DosenData18 list = new DosenData18();
        // jika tidak menggunakan input
        // Dosen18 d1 = new Dosen18("111", "Budi", true, 45);
        // Dosen18 d2 = new Dosen18("222", "Ari", true, 57);
        // Dosen18 d3 = new Dosen18("333", "Mawlina", false, 33);

        // list.tambah(d1);
        // list.tambah(d2);
        // list.tambah(d3);

        list.input();
        
        System.out.println();
        System.out.println("Tampilan Data");
        System.out.println("------------------------------------");

    
        System.out.println("Data Asli");
        list.tampil();

        System.out.println("Data diurutkan secara ASC (Ascending)");
        list.SortingASC();
        list.tampil();

        System.out.println("Data diurutkan secara DSC (Descending)");
        list.SortingDSC();
        list.tampil();
    }
}

