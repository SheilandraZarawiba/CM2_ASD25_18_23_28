public class DaftarPasien {
    NodePasien head, tail;
    int size;

    boolean isEmpty() {
        return (head == null);
    }

    public void addLast(Pasien pasien) {
        NodePasien newNode = new NodePasien(tail, pasien, null);
         if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Pasien masuk ke dalam antrian");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("-- Antrian Pasien --");
            NodePasien current = head;
            System.out.printf("| %-10s | %-15s | %-15s |\n", "Nama", "NIK", "Keluhan");
            while (current != null) {
                System.out.printf("| %-10s | %-15s | %-15s |\n", current.data.nama, current.data.nik, current.data.keluhan);
                current = current.next;
            }
        }
    }

    public Pasien getFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        return head.data;
    }

    public void layaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // public void removeLast() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian masih kosong");
    //     } else if () {
           
    //         return;
    //     }
    // }

     public int hitungAntrian() {
        return size;
    }
}
