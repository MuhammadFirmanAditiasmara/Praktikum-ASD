
public class StackSurat18 {

    Surat18[] stack;
    int top;
    int size;

    public StackSurat18(int size) {
        this.size = size;
        stack = new Surat18[size];
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

    public void push(Surat18 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambahkan surat lagi.");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk");
            return null;
        }
    }

    public Surat18 cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }
    

}
