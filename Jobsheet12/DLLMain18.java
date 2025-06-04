package Jobsheet12;

import java.util.Scanner;

public class DLLMain18 {

    public static Mahasiswa18 inputMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan IPK: ");
        double IPK = input.nextDouble();
        Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, IPK);

        return mhs;
    }

    public static void main(String[] args) {
        DoubleLinkedList18 list = new DoubleLinkedList18();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println();
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan data"); // modifikasi
            System.out.println("8. Sisipkan dengan index"); // Tugas
            System.out.println("9. Hapus data setelah NIM yang dipilih"); // Tugas
            System.out.println("10. Hapus data dengan index"); // Tugas
            System.out.println("11. Tampil data awal"); // Tugas
            System.out.println("12. Tampil data akhir"); // Tugas
            System.out.println("13. Tampil data sesuai index"); // Tugas
            System.out.println("14. Tampil jumlah data"); // Tugas
            
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa18 mhs = inputMahasiswa(input);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa18 mhs = inputMahasiswa(input);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> {
                    list.removeLast();
                }
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = input.nextLine();
                    Node18 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }

                // modifikasi
                case 7 -> {
                    System.out.println("Penyisipan data diletakkan setelah data dengan NIM yang anda masukkan");
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = input.nextLine();

                    System.out.println("Masukkan data: ");
                    Mahasiswa18 newData = inputMahasiswa(input);
                    list.insertAfter(keyNim, newData);
                }

                // Tugas
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = input.nextInt();
                    input.nextLine();
                    
                    Mahasiswa18 nodeIndex = inputMahasiswa(input);
                    list.add(index, nodeIndex);
                    break;
                    
                }
                
                // Tugas
                case 9 -> {
                    System.out.print("Masukkan acuan NIM: ");
                    
                    String keyNim = input.nextLine();
                    list.removeAfter(keyNim);
                }
                // Tugas
                case 10 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = input.nextInt();
                    input.nextLine();

                    list.remove(index);
                }
                
                // Tugas
                case 11 -> list.getFirst();
                // Tugas
                case 12 -> list.getLast();
                // Tugas
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = input.nextInt();
                    input.nextLine();
                    
                    list.getIndex(index);
                } 
                // Tugas
                case 14 -> {
                    System.out.print("Jumlah data: " + list.size());
                    
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        input.close();
    }

}
