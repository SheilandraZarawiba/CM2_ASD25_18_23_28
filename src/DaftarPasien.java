public class DaftarPasien {
    NodePasien head, tail;
    int size;

    boolean isEmpty18() {
        return (head == null);
    }

    public void addLast(Pasien pasien) {
        NodePasien newNode = new NodePasien(tail, pasien, null);
         if (isEmpty18()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        if (!isEmpty18()) {
            NodePasien tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
