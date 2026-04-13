package pasd6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi12 data = new DaftarMahasiswaBerprestasi12();
        
        // Membuat data mahasiswa
        Mahasiswa12 m1 = new Mahasiswa12("Nusa", 2017, 25, 3.0);
        Mahasiswa12 m2 = new Mahasiswa12("Rara", 2012, 19, 4.0);
        Mahasiswa12 m3 = new Mahasiswa12("Dompu", 2018, 19, 3.5);
        Mahasiswa12 m4 = new Mahasiswa12("Abdul", 2017, 23, 2.0);
        Mahasiswa12 m5 = new Mahasiswa12("Ummi", 2019, 21, 3.75);

        // Memasukkan ke list
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        data.tambah(m5);

        System.out.println("Data Mahasiswa12 sebelum sorting:");
        data.tampil();

        System.out.println("Data Mahasiswa12 setelah Bubble Sort (IPK Desc):");
        data.bubbleSort();
        data.tampil();

        System.out.println("Data Mahasiswa12 setelah Selection Sort (IPK Desc):");
        data.selectionSort();
        data.tampil();

        System.out.println("Data Mahasiswa12 setelah Insertion Sort (IPK Asc):");
        data.insertionSort();
        data.tampil();
    }
}
