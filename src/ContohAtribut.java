public class ContohAtribut {

    static String teks1 = "Helloworld";
    static int nomor1 = 123;

    String teks2 = "Halo halo";
    int nomor2 = 777;

    public ContohAtribut(){

    }

    public static void main(String[] args) {

        System.out.println("Text: "+teks1);
        System.out.println("Number: "+nomor1);

        ContohAtribut test1 = new ContohAtribut();

        System.out.println("Text non static: "+test1.teks2);
        System.out.println("Number non static: "+test1.nomor2);
    }
}
