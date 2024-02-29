import java.util.Scanner;

public class GanjilGenap {

    public static String jawabanSoal(int a, int b){
        if((a+b+1)%2==0) return "Genap";
        else return "Ganjil";

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama:");
        int a = in.nextInt();

        System.out.println("Masukkan angka kedua:");
        int b = in.nextInt();

        in.close();

        System.out.println("Sum: "+(a+b+1));
        System.out.println("Hasil: "+jawabanSoal(a,b));
    }
}
