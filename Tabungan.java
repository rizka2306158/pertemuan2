import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Apakah sudah memiliki calon pasangan? (yes/no): ");
        String calon = myObj.nextLine();

        System.out.print("Masukkan jumlah tabungan (dalam juta): ");
        int tabungan = myObj.nextInt();

        boolean menikah = (tabungan > 100 && calon.equals("yes"));

        System.out.println("Memiliki pasangan: " + calon);
        System.out.println("Jumlah tabungan: " + tabungan);
        System.out.println("Status izin menikah: " + menikah);

        myObj.close();
    }
}
