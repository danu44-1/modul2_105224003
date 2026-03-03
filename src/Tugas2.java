import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Masukkan suhu (celcius) : ");
        double suhu = input.nextInt();

        System.out.print(
                "hasil suhu (fahrenheit) : ");
        System.out.printf(
                "%.2f", ((suhu * 9 / 5) + 32));
        System.out.print(
                "\n");

        System.out.print(
                "hasil suhu (kelvin) : ");
        System.out.printf(
                "%.2f", (suhu + 273.15));
        System.out.print(
                "\n");

        System.out.print(
                "hasil suhu (reamur) : ");
        System.out.printf(
                "%.2f", (suhu * 4 / 5));

        input.close();

    }

}
