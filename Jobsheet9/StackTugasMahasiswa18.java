

public class StackTugasMahasiswa18 {

    Mahasiswa18[] stack;
    int top;
    int size;

    public StackTugasMahasiswa18(int size) {
        this.size = size;
        stack = new Mahasiswa18[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;

        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;

        } else {
            return false;
        }
    }

    public void push(Mahasiswa18 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;

        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa18 pop() {
        if (!isEmpty()) {
            Mahasiswa18 m = stack[top];
            top--;
            return m;

        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;

        }
    }

    // Pertanyaan nomor 4 Percobaan 1
    public Mahasiswa18 peekBot() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;

        }
    }

    // Pertanyaan nomor 5 Percobaan 1
    public int jumlahTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Percobaan 2
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi18 stack = new StackKonversi18();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}
