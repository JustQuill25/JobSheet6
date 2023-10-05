import java.util.Scanner;

public class Pemilihan2Percobaan1TahunBukanKabisat {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.println("Masukkan Tahun : ");
        int tahun = input01.nextInt();

        if ((tahun % 4) == 0 && tahun % 100 != 0 || tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");

        } else {
            System.out.println("Tahun 2100 Bukan Tahun Kabisat");
        }
    }    
}