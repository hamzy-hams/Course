package pasd7;
import java.util.Scanner;

public class MahasiswaMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs12 data = new PencarianMhs12();
        int jumMhs = 5;

        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil :");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa12 m = new Mahasiswa12(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_______________________________________________________");
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        int cari = s.nextInt();

        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}