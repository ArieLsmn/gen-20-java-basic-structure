import java.util.Scanner;

public class Segitiga {

    public static void Segitiga(int besar){


        for(int i=0;i<besar;i++) {

            for (int j = 0; j <= besar-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= besar-(besar-i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan lebar segitiga:");
        int besar = in.nextInt();
        Segitiga(besar);


    }
}
