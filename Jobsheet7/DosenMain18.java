import java.util.Scanner;

public class DosenMain18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DosenData18 list = new DosenData18();

        // Input data dosen
        list.input();

        // System.out.println();
        // System.out.println("Tampilan Data");
        // System.out.println("------------------------------------");

        // System.out.println("Data Asli");
        // list.tampil();

        // System.out.println("Data diurutkan secara ASC (Ascending)");
        // list.SortingASC();
        // list.tampil();

        // System.out.println("Data diurutkan secara DSC (Descending)");
        // list.SortingDSC();
        // list.tampil();

        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");

        System.out.print("Masukkan nama dosen yang dicari: ");
        String cari = input.next();

        System.out.print("Masukkan Umur dosen yang dicari: ");
        int cariUmur = input.nextInt();

        System.out.println("\nMenggunakan sequential searching");
        int posisiSeq = list.PencarianDataSequential18(cari);
        list.tampilPosisi(cari, posisiSeq);
        list.tampilDataSearch(cari, posisiSeq);

        System.out.println("\nMenggunakan binary searching");
        list.SortingASC(); 
        int posisiBin = list.PencarianDataBinary18(cariUmur, 0, list.idx - 1);
        list.tampilPosisiBinary(cariUmur, posisiBin);
        list.tampilDataSearchBinary(cariUmur, posisiBin);
    }
}
