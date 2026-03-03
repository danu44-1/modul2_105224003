import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Masukkan panjang : ");
        double panjang = input.nextInt();
        System.out.println(
                "Masukkan lebar : ");
        double lebar = input.nextInt();
        System.out.println(
                "Masukkan tinggi : ");
        double tinggi = input.nextInt();

        double luasDinding = 2 * (panjang + lebar) * tinggi;
        double kebutuhanCat = luasDinding / 10;

        System.out.println(
                "Hasilnya sisi : " + luasDinding);

        System.out.println(
                "Hasilnya Cat liter : " + Math.ceil(kebutuhanCat));

    }

}
