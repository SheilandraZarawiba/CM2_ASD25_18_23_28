public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan, biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya(){
        return durasiLayanan * 50000;
    }

    public void tampilkan(){
        System.out.printf("%-10s %-15s %-6d %-8d\n", pasien.nama, dokter.nama, durasiLayanan, biaya);
    } 
}
