package Jobsheet12;

public class DoubleLinkedList18 {
    Node18 head;
    Node18 tail;

    public DoubleLinkedList18() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa18 data) {
        Node18 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukn.");
            return;
        }
        Node18 newNode = new Node18(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        // modifikasi
        if (head == null) {
            System.out.println("Linked list kosong.");
            return;
        }

        Node18 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        // modifikasi
        System.out.println("Warning: Linked list masih berisi data.");
    }

    public void removeFirst() {

        Mahasiswa18 hapus = head.data;

        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah ");
        hapus.tampil();
    }

    public void removeLast() {

        Mahasiswa18 hapus = tail.data;

        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah ");
        hapus.tampil();

    }

    public Node18 search(String nim) {
        Node18 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Tugas
    public void add(int index, Mahasiswa18 data) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }

        Node18 newNode = new Node18(data);

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node18 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            addLast(data);
        } else {
            Node18 prevNode = current.prev;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = current;
            current.prev = newNode;

            System.out.println("Data berhasil ditambahkan pada indeks ke-" + index);
        }
    }

    // tugas
    public void removeAfter(String keyNim) {

        Node18 current = head;
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bisa dihapus");
            return;
        }

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;

        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Data berada pada posisi terakhir, tidak ada data selanjutnya untuk dihapus");
        }

        Node18 hapus = current.next;

        if (hapus == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = hapus.next;
            hapus.next.prev = current;
        }

        System.out.print("Data berhasil terhapus, data yang terhapus adalah ");
        hapus.data.tampil();
    }

    // Tugas
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa dihapus.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        Node18 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            System.out.println("Index melebih jumlah elemen pada list");
            return;
        }

        Mahasiswa18 hapus = current.data;

        if (head == tail) {
            head = tail = null;
        }

        else if (current == head) {
            head = head.next;
            head.prev = null;
        }

        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.prev;
            current.next.prev = current.prev;
        }
        System.out.print("Data berhasil dihapus. Data yang terhapus adalah ");
        hapus.tampil();

    }

    // Tugas
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data untuk ditampilkan");
        } else {
            System.out.print("Data pertama: ");
            head.data.tampil();
        }
    }

    // Tugas
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data untuk ditampilkan");
        } else {
            System.out.print("Data terakhir: ");
            tail.data.tampil();
        }
    }

    // Tugas
    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data untuk ditampilkan");
        }
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        Node18 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi batas.");
        } else {
            System.out.print("Data berada pada indeks ke-" + index + ": ");
            current.data.tampil();
        }
    }

    public int size() {
        int count = 0;
        Node18 current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

}