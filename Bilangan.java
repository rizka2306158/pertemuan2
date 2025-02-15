import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.print("Masukkan bilangan pecahan negatif pertama:");
    float bilanganPertama = myObj.nextFloat();

    System.out.print("Masukkan bilangan pecahan negatif kedua:");
    float bilanganKedua= myObj.nextFloat();

    System.out.print("Masukkan bilangan pecahan negatif ketiga:");
    float bilanganKetiga = myObj.nextFloat();

    System.out.println("Hasil penjumlahan: " + (bilanganPertama + bilanganKedua + bilanganKetiga));
    System.out.println("Hasil pengurangan: " + (bilanganPertama - bilanganKedua - bilanganKetiga));
    System.out.println("Hasil perkalian: " + (bilanganPertama * bilanganKedua * bilanganKetiga));
    System.out.println("Hasil pembagian: " + (bilanganPertama / bilanganKedua / bilanganKetiga));

    myObj.close();
    }
}
