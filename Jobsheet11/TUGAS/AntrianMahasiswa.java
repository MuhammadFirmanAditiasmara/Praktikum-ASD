package TUGAS;

public class AntrianMahasiswa {
    int size = 0;
    int max = 10;
    NodeMahasiswa front;
    NodeMahasiswa rear;

    boolean isEmpty() {
        return (front == null);
    }

    boolean isFull() {
        return (size >= max);
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah data");
            return;
        }
        NodeMahasiswa add = new NodeMahasiswa(mhs);
        if (isEmpty()) {
            front = rear = add;

        } else {
            rear.next = add;
            rear = add;

        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " telah ditambahkan ke antrian.");

    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Memanggil antrian: ");
            System.out.println("Nama: " + front.data.nama);
            System.out.println("NIM: " + front.data.nim);
            System.out.println("Kelas: " + front.data.kelas);

            front = front.next;
            size--;
        }

    }

    public void antrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: " + front.data.nama + " (" + front.data.nim + ")");
        }

    }
    public void antrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: " + rear.data.nama + " (" + rear.data.nim + ")");
        }
    }

    public void jmlAntrian () {
        System.out.println("Jumlah dalam antrian: " + size);
    }
}
