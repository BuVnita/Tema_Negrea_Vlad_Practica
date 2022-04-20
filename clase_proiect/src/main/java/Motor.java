public class Motor {
    private int cilindri;
    private String nume;
    private boolean electric;
    public float greutate;

    public int getCilindri() {
        return cilindri;
    }

    public void setCilindri(int cilindri) {
        this.cilindri = cilindri;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindri=" + cilindri +
                ", nume='" + nume + '\'' +
                ", electric=" + electric +
                ", greutate=" + greutate +
                '}';
    }
}
