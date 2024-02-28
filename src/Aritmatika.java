

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
        Aritmatika test1 = new Aritmatika();

        test1.hasilAritmatika();

        Aritmatika test2 = new Aritmatika(9,3);
        test2.hasilAritmatika();

    }
}
