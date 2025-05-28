
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
}


