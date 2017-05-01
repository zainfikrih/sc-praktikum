package Praktikum5;

/**
 * Created by Zain Fikri H on 04/04/2017.
 */
public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
    }
    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }
    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }
    public double hitungPembagian(String nil, String nil2){
        double a = Double.parseDouble(nil);
        double b = Double.parseDouble(nil2);
        System.out.print("nilai pembagian adalah : ");
        return a/b;
    }
}