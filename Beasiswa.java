
import java.util.Scanner;

public class Beasiswa {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA");
        int TPA = masukan.nextInt();
        System.out.println("Masukkan nilai Bahasa Inggris");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)) {
            System.out.println("Siswa dapat Beasiswa"); 
        }else {
            System.out.println("Siswa tidak dapat Beasiswa");
        }
    }

}
