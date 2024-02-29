import java.util.Scanner;

public class Aritmatika {

    double a = 1; //atribut
    double b = 1;

    public Aritmatika(){
    }
    public Aritmatika(int a, int b){
        this.a=a;
        this.b=b;

    }
    public void hasilAritmatika(){
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama:");
        int x = in.nextInt();
        System.out.println("Masukkan angka kedua:");
        int y = in.nextInt();
        Aritmatika test2 = new Aritmatika(x,y);
        test2.hasilAritmatika();

        in.close();

    }
}
