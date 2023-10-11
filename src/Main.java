import java.util.Scanner;
public class Main {

    public String ayam_goyeng = "ayam";
    int b=42;
    public static void main(String[] args) {

//
//        // PASS BY REFERENCE CUY
        Main ayam = new Main();
        System.out.println(ayam.bebek(10));
//        Main bebek = ayam;
//
//        System.out.println("Before");
//        System.out.println("ayam = " + ayam.ayam_goyeng);
//        System.out.println("bebek = " + bebek.ayam_goyeng);
//        System.out.println();
//
//        ayam.ayam_goyeng = "ayamgoyeng";
//
//        System.out.println("After");
//        System.out.println("ayam = " + ayam.ayam_goyeng);
//        System.out.println("bebek = " + bebek.ayam_goyeng);
//        System.out.println();

    }

    int bebek(int b){
        return b;
    }

//    void useThis(){
//        String nama = "Ayam";
//        String namaLagi = nama;
//
//        System.out.println("Before");
//        System.out.println("nama : " + nama);
//        System.out.println("namaLagi : " + namaLagi);
//
//        nama = "ayamgoyeng";
//
//        System.out.println("After");
//        System.out.println("nama : " + nama);
//        System.out.println("namaLagi : " + namaLagi);
//
//        System.out.println();
//    }
}