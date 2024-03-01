//kelas hari 3

import java.util.Scanner;

public class Segitiga {


    public static void printSegitiga(int lebar){


        for(int i=0;i<lebar;i++) {

            for (int j = 0; j <= lebar-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= lebar-(lebar-i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan lebar segitiga selanjutnya:");
        int a = in.nextInt();
        printSegitiga(a);

    }
}
