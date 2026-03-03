import java.util.Scanner;

public class aktivitasPrak_mod2 {
        public static void main(String[] args) throws Exception {
                String nama = "Danu Dimas";
                int sks = 4;
                double ipk = 4.0;
                boolean isLulus = true;

                System.out.print(
                                "Nama : " + nama + "\n");

                System.out.println(
                                "SKS : " + sks + " dengan IPK " + ipk);

                System.out.println(
                                "Apakah saya lulus : " + isLulus);

                int a = 10, b = 20;
                int c = 10, d = 3;

                System.out.println(
                                "Hasil dari 10 x 20: " + (a * b));
                System.out.println(
                                "Hasil dari 10 / 3: " + ((double) c / d));
                System.out.println(
                                "Hasil dari 10 + 3: " + (c + d));
                System.out.println(
                                "Hasil dari 10 - 3: " + (c - d));
                System.out.println(
                                "Hasil dari 10 modulus 3: " + (c % d));

                Scanner input = new Scanner(System.in);

                System.out.println(
                                "Masukkan tanggal lahir: ");
                int tanggalLahir = input.nextInt();

                System.out.println(
                                "tanggal lahir: " + tanggalLahir);

                System.out.println(
                                "===================================\nKARTU TANDA MAHASISWA \nNama\t:Danu Dimas Putra \nNIM\t:105224003 \nProdi\t:Ilmu Komputer \n=================================");
        }
}
