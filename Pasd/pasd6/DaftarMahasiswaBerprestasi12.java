package pasd6;

public class DaftarMahasiswaBerprestasi12 {
    Mahasiswa12 listMhs[] = new Mahasiswa12[5];
    int idx;

    // Menambahkan objek mahasiswa ke dalam array
    void tambah(Mahasiswa12 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // Menampilkan semua data dalam list
    void tampil() {
        for (Mahasiswa12 m : listMhs) {
            if (m != null) {
                m.tampil();
                System.out.println("--------------------");
            }
        }
    }

    // Algoritma Bubble Sort (Berdasarkan IPK Descending)
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // Proses Swap Object
                    Mahasiswa12 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    // Algoritma Selection Sort (Berdasarkan IPK Descending)
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // Swap
            Mahasiswa12 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // Algoritma Insertion Sort (Berdasarkan IPK Ascending)
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa12 temp = listMhs[i];
            int j = i;
            // Untuk Ascending: listMhs[j-1].ipk > temp.ipk
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}