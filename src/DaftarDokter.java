
public class DaftarDokter {
    NodeDokter head, tail;
    int size;

    public DaftarDokter() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Dokter searchDokterId(String id) {
        NodeDokter current = head;
        while (current != null) {
            if (current.data.getIdDokter().equalsIgnoreCase(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void addLast(Dokter data) {
        NodeDokter newNode = new NodeDokter(null, data, null);

        if (isEmpty()) {

            head = tail = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

     public void tampilDaftarDokter() {
        System.out.println("Daftar dokter jaga :");
        System.out.printf("%-10s%-20s\n", "Kode", "Nama");

        NodeDokter current = head;
        while (current != null) {
            System.out.printf("%-10s%-20s\n", current.data.idDokter, current.data.nama);
            current = current.next;
        }
    }
}


