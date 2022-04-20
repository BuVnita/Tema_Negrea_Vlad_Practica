public class Tractor extends Masina{

    private String Tara_Fabricare;

    @Override
    public String getMarca()
    {
        return super.getMarca() + " model agricultural";
    }

    @Override
    public String toString(){
        return "model agricultural " + super.toString();
    }

}
