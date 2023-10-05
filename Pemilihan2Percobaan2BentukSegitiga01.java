import java.util.Scanner;

public class Pemilihan2Percobaan2BentukSegitiga01 {
    public static void main(String[] args) {

        Scanner input01 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;
        String jenis;

        System.out.println("Masukkan Sudut 1 : ");
        sudut1 = input01.nextInt();
        System.out.println("Masukkan Sudut 2 : ");
        sudut2 = input01.nextInt();
        System.out.println("Masukkan Sudut 3 : ");
        sudut3 = input01.nextInt();
        
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                jenis = "Segitiga Siku - siku";

            } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                jenis = "Segitiga Sama Sisi";
            } else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut3 == sudut2)) {
                jenis = "Segitiga Sama Kaki";
            } else {
                jenis = "Segitiga Sembarang";
            }

            System.out.println("Segitiga Tersebut Adalah " + jenis);

        } else {
            System.out.println("Bukan Segitiga");
        } 
    }
}
