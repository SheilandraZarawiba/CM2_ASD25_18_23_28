
import java.util.Scanner;

public class KlinikDokterMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int pilihan;

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

            String nama, sakit;
            int NIK, jam;
            switch (pilihan) {
                case 1:
                    System.out.print("Input Nama Pasien : ");
                    nama = sc.nextLine();
                    System.out.print("NIK : ");
                    NIK =  sc.nextInt();
                    System.out.print("Keluhan : ");
                    sakit = sc.nextLine();
                    break;
                case 2:
                    
                    break;
                case 3:

                    System.out.println("Pilih Dokter: ");
                    System.out.print("Input durasi layanan(jam) : ");
                    jam = sc.nextInt();
                    break;
                case 4:
                    
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