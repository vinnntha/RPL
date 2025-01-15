
import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu yang mau anda konversikan : ");
        int suhu = input.nextInt();
        System.out.println("Mau dikonversikan ke apa? 1.Reamur 2.Farenhit 3.Kelvin");
        int pilihan = input.nextInt();

        double hasil = 0;

        if (pilihan == 1) {
            hasil = suhu * 0.8;
            System.out.println("Konversi " + suhu + " ke Reamur menjadi : " + hasil);
        } else if (pilihan == 2) {
            hasil = (suhu * 9 / 5) + 32;
            System.out.println("Konversi " + suhu + " ke Farenhit menjadi : " + hasil);
        } else if (pilihan == 3) {
            hasil = suhu + 273.15;
            System.out.println("Konversi " + suhu + " ke Kelvin menjadi : " + hasil);
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }

}
