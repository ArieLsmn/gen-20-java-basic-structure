import java.util.Scanner;

public class Segitiga {

    static int input=5; //atribut

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
        System.out.println("Print segitiga dengan variabel atribut class");
        printSegitiga(input);
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan lebar segitiga selanjutnya:");
        int a = in.nextInt();
        printSegitiga(a);

    }
}
