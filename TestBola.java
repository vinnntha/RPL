public class TestBola {
    public static void main(String[] args) {
        double jarijari = 7.0; 
        Bola bola = new Bola(); 

        bola.setJariJari(jarijari);
        System.out.println("Diameter: " + bola.showDiameter());
        System.out.println("Luas Permukaan: " + bola.showLuasPermukaan());
        System.out.println("Volume: " + bola.showVolume());

        jarijari = 10.0;
        bola.setJariJari(jarijari);

        System.out.println("\nSetelah mengubah jari-jari:");
        System.out.println("Diameter: " + bola.showDiameter());
        System.out.println("Luas Permukaan: " + bola.showLuasPermukaan());
        System.out.println("Volume: " + bola.showVolume());
    }
}