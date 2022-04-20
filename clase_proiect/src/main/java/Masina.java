public class Masina {
    private String nume;
    private int serie;
    private String marca;
    private Motor motor;
    private boolean offroad;

    public Masina() {
        super();
        motor=new Motor();
    }

    public boolean isOffroad() {
        return offroad;
    }

    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "nume='" + nume + '\'' +
                ", serie=" + serie +
                ", marca='" + marca + '\'' +
                ", motor=" + motor +
                ", offroad=" + offroad +
                '}';
    }
}
