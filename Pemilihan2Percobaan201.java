import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {

        Scanner input01 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;
        System.out.println("Besar Sudut 1 : ");
        sudut1 = input01.nextInt();
        System.out.println("Besar Sudut 2 : ");
        sudut2 = input01.nextInt();
        System.out.println("Besar Sudut 3 : ");
        sudut3 = input01.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku siku");
        } else{

            System.out.println("Bukan Segitiga");
        }

    }
}
