import java.util.Scanner;

/*Danu Dimas Putra 105224003 */

public class LogiCalc {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("====== SISTEM LOGICALC FASTSEND ====== \n");
        System.out.print("Masukkan Nama Klien : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Berat (Kg) : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak (Km) : ");
        int jarak = input.nextInt();

        System.out.print("Masukkan Jumlah Total Box/Kardus : ");
        int box = input.nextInt();

        int kapasitasTruk = 150;
        int trukPenuh = box / kapasitasTruk;
        int sisaBox = box % kapasitasTruk;

        int tarifJarak = 15000;
        int tarifBerat = 5500;
        double dasarBiaya = (tarifJarak * jarak) + (tarifBerat * berat);
        double asuransiWajib = 0.035 * dasarBiaya;
        double totalTagihan = dasarBiaya + asuransiWajib;

        int jam = jarak / 60;
        int menit = jarak % 60;

        System.out.println("\n====== RESI PENGIRIMAN ====== \n Klien\t: " + nama + "\n Total Box\t: " + box
                + "\n Kebutuhan Armada: " + trukPenuh + " Truk Penuh dan sisa " + sisaBox + " via pikap \n");

        System.out.println("Estimasi Waktu : [" + jam + "] jam [" + menit + "] menit (Asumsi 60km/jam) \n");

        System.out.println("====== RINCIAN BIAYA ====== \n Dasar Biaya\t: Rp." + dasarBiaya + "\n Asuransi (3.5%) : Rp."
                + asuransiWajib + "\n -------- \n Total Bayar\t: Rp." + totalTagihan);

        input.close();
    }
}
