package JavaStart.Cwiczenie.Konstrukcjasuper;

public class Apple extends Fruit {

    private String variety;
    public static final String TYPE = "jabłkowaty";

    public Apple(double weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", odmiana: " + variety;
    }
}
