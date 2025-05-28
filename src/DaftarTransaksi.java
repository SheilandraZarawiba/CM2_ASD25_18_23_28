public class DaftarTransaksi {
    NodeTransaksi head;

    public void tambah(TransaksiLayanan data){
        NodeTransaksi NdTransaksi = new NodeTransaksi(data, null);
        if (head == null) {
            head = NdTransaksi;
        } else {
            NodeTransaksi current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = NdTransaksi;
        }
    }

    public void tampilRiwayat() {
        System.out.printf("%-10s %-15s %-10s %-10s\n", "Nama", "Nama Dokter", "Durasi", "Total");
        NodeTransaksi current = head;
        while (current != null) {
            current.data.tampilkan();
            current = current.next;
        }
    }

    public void sortNamaPasienDescending() {
        if (head == null || head.next == null) return;

        for (NodeTransaksi i = head; i.next != null; i = i.next) {
            for (NodeTransaksi j = i.next; j != null; j = j.next) {
                if (i.data.pasien.nama.compareToIgnoreCase(j.data.pasien.nama) < 0) {
                    TransaksiLayanan temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
}
