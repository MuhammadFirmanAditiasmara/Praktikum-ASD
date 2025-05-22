
public class SLL {

    N18 head;
    N18 tail;

    boolean isEmpty() {
        return (head == null);

    }

    public void print() {
        if (!isEmpty()) {
            N18 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst (M18 input) {
        N18 ndInput = new N18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast (M18 input) {
        N18 ndInput = new N18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter (String key, M18 input) {
        N18 ndInput = new N18(input, null);
        N18 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt (int index, M18 input){
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            N18 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new N18(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
