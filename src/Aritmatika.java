import java.util.Scanner;

public class Aritmatika {

    public static void Aritmatika(int a, int b){

        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama:");
        int a = in.nextInt();

        System.out.println("Masukkan angka kedua:");
        int b = in.nextInt();

        Aritmatika(a,b);

    }
}
