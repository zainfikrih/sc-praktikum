package Praktikum5;

/**
 * Created by Zain Fikri H on 04/04/2017.
 */
import java.util.Scanner;
public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        nil1  = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int value1  = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
        //memanggil method NONstatic harus melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);
        //memanggil method NONstatic hitungPembagian
        System.out.print("masukkan nilai 1 : ");
        String nil3 = in.next();
        System.out.print("masukkan nilai 2 : ");
        String nil4 = in.next();
        System.out.println(a.hitungPembagian(nil3,nil4));
    }
}
