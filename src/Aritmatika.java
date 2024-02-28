import java.util.Scanner;

public class Aritmatika {

    int a = 10; //atribut
    int b = 2;

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
        System.out.println("Print aritmatika dengan variabel atribut class a=10, b=2");
        Aritmatika test1 = new Aritmatika();
        test1.hasilAritmatika();
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama (a):");
        int x = in.nextInt();
        System.out.println("Masukkan angka kedua (b):");
        int y = in.nextInt();
        Aritmatika test2 = new Aritmatika(x,y);
        test2.hasilAritmatika();
        System.out.println();

    }
}
