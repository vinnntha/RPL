public class Bola {
    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double showDiameter() {
        return 2 * jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}