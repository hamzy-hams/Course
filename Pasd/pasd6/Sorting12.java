package pasd6;

class Sorting {
    private int[] data;
    private int jumData;

    public Sorting(int Data[], int jmlDat) {
        this.jumData = jmlDat;
        this.data = new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            this.data[i] = Data[i];
        }
    }


    public void bubble() {
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void insertion() {
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            
            data[j + 1] = temp;
        }
    }

    public void show() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class Sorting12 {
    public static void main(String[] args) {
        int[] input_angka = {25, 14, 3, 99, 56, 10};
        int panjang_arr = input_angka.length;

        Sorting bubble = new Sorting(input_angka, panjang_arr);
        Sorting insertion = new Sorting(input_angka, panjang_arr);
        

        System.out.println("Sebelum Sorting");
        bubble.show();
        insertion.show();

        bubble.bubble();
        insertion.insertion();

        System.out.println("\n Sesudah Bubble Sort");
        bubble.show();
        insertion.show();
    }
}