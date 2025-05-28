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

    public void layaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        System.out.println("Pasien: " + head.data.nama + " dipanggil");
    }

     public int hitungAntrian() {
        int size = 0;
        NodePasien temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
