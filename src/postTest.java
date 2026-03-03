import java.util.Scanner;

public class postTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Masukkan nama karyawan : ");
        String nama = input.nextLine();
        System.out.println(
                "Masukkan gaji pokok : ");
        double gaji = input.nextInt();
        System.out.println(
                "Masukkan jam lembur : ");
        int jam = input.nextInt();

        System.out.println(
                "Upah Lembur per Jam : " + (gaji / 173));
        System.out.println(
                "Total Uang Lembur : " + (jam * (gaji / 173)));
        System.out.println(
                "Gaji Kotor (Bruto) : " + (gaji + (jam * (gaji / 173))));
        System.out.println(
                "Pajak Penghasilan : " + ((gaji + (jam * (gaji / 173))) * 0.05));
        System.out.println(
                "Potongan BPJS : " + (gaji * 0.01));
        System.out.println(
                "Gaji Bersih (Netto) : "
                        + ((gaji + (jam * (gaji / 173)) - ((gaji + (jam * (gaji / 173))) * 0.05) - (gaji * 0.01))));

        input.close();
    }
}
