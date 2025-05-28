import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa18 mhs2 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
        Mahasiswa18 mhs3 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
        Mahasiswa18 mhs4 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        // Modifikasi pertanyaan percobaan 1
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println();

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        sll.print();

    }
}
