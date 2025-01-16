public class Projek1 {
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double penumpangBaru;

    public Projek1(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        this.penumpang = 0;
        this.counter = 0;
    }

    public void addPenumpang(double penumpang) {
        if (this.penumpang + penumpang <= maxPenumpang) {
            this.penumpang += penumpang;
            this.counter++;
        } else {
            System.out.println("Kapasitas maksimum terlampaui!");
        }
    }

    public double getPenumpang() {
        return this.penumpang;
    }

    public double getAverage() {
        if (counter == 0) {
            return 0;
        }
        return this.penumpang / counter;
    }


    public void cetak() {
        System.out.println("Total berat penumpang: " + this.penumpang);
        System.out.println("Jumlah penumpang: " + this.counter);
        System.out.println("Rata-rata berat penumpang: " + getAverage());
    }
}