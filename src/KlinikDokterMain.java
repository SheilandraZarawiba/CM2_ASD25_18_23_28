
import java.util.Scanner;

public class KlinikDokterMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int pilihan;
        
        DaftarPasien daftarPasien = new DaftarPasien(); 
        DaftarTransaksi daftarTransaksi = new DaftarTransaksi();
        DaftarDokter daftarDokter = new DaftarDokter();

        daftarDokter.addLast(new Dokter("dr01", "Wike Ratanca"));
        daftarDokter.addLast(new Dokter("dr02", "Santi Runica"));
        daftarDokter.addLast(new Dokter("dr03", "Waskito"));
        daftarDokter.addLast(new Dokter("dr04", "Slamet Sugito"));

        do {
            System.out.println("Sistem Antrian Klinik");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            String nama, sakit, NIK;
            int jam;
            switch (pilihan) {
                case 1:
                    System.out.print("Input Nama Pasien : ");
                    nama = sc.nextLine();
                    System.out.print("NIK : ");
                    NIK = sc.nextLine();;
                    System.out.print("Keluhan : ");
                    sakit = sc.nextLine();
                    Pasien pasien = new Pasien(nama, NIK, sakit);
                    daftarPasien.addLast(pasien);
                    break;
                case 2:
                    daftarPasien.print();
                    break;
                case 3:
                    Pasien pasienDilayani = daftarPasien.layaniPasien();
                    System.out.println("Pasien: " + pasienDilayani.nama + " dipanggil");
                    daftarDokter.tampilDaftarDokter();
                    System.out.print("Input kode dokter: ");
                    String idDokter = sc.nextLine();
                    Dokter dokterDipilih = daftarDokter.searchDokterId(idDokter);
                    System.out.print("Input durasi layanan(jam) : ");
                    jam = sc.nextInt();
                    TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokterDipilih, jam);
                    daftarTransaksi.tambah(transaksi);
                    System.out.println("Pasien telah dilayani, transaksi berhasil dicatat");
                    break;
                case 4:
                    System.out.println("Sisa antrian: " + daftarPasien.hitungAntrian());
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                default:
                    break;
            }

        } while (pilihan !=6);
    }   
}