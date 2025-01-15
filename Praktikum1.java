import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jarinya: ");
        int r = input.nextInt();

        double luasPermukaan = 4 * Math.PI * Math.pow(r, 2);

        System.out.println("Luas permukaan bola adalah: " + luasPermukaan);

    }
}
