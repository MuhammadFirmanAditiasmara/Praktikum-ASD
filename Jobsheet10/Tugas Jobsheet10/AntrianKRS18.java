
public class AntrianKRS18 {

    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max = 10;
    int proses;
    int ditangani = 30;
    public AntrianKRS18(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void memanggilAtrian() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2. Minimal 2 mahasiswa untuk proses KRS.");
            return;
        }

        System.out.println("Memproses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            mhs.tampil();
            front = (front + 1) % max;
            size--;
            proses++;
        }
    }
    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
            System.out.println("Daftar Mahasiswa dalam Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampil();
            }
        }
    
    public void tampilDuaTerdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 antrian terdepan.");
            return;
        }

        System.out.println("2 antrian terdepan:");
        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampil();
            i = (i + 1) % max;
        }
    }

    public void tampilAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.print("Antrian paling akhir: ");
        data[rear].tampil();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + " mahasiswa");
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + proses + " mahasiswa");
    }

    public void cetakBelumDiproses() {
        int sisa = ditangani - proses;
        System.out.println("Mahasiswa yang belum melakukan proses KRS: " + sisa + " mahasiswa");
    }


}
