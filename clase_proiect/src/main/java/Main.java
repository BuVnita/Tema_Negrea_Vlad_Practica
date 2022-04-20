public class Main {
    public static void main(String[] args) {

        Masina M = new Masina();

        System.out.println(M.getNume());
        System.out.println(M.getSerie());
        System.out.println(M.getMarca());
        System.out.println(M.getMotor());
        System.out.println(M.isOffroad());
        System.out.println(M.toString());
        System.out.println("\n===========================\n");
        Tractor T = new Tractor();
        System.out.println(T.getNume());
        System.out.println(T.getSerie());
        System.out.println(T.getMarca());
        System.out.println(T.getMotor());
        System.out.println(T.isOffroad());
        System.out.println(T.toString());
    }
}
