import java.util.Scanner;

public class GanjilGenap {

    public static String GanjilGenap(int a, int b){
        if((a+b+1)%2==0) return "Genap";
        else return "Ganjil";

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama:");
        int a = in.nextInt();

        System.out.println("Masukkan angka kedua:");
        int b = in.nextInt();

        System.out.println(GanjilGenap(a,b));
    }
}
