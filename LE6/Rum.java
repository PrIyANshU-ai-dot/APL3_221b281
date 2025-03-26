public class Rum extends Decorator {
    public Rum(Offering offering) {
        super(offering);

    }

    public int getprice() {
        return offering.getprice()+ 55;
    }

    public String getname() {
        return offering.getname() + " with Rum";
    }

}
