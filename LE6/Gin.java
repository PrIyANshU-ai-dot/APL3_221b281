public class Gin extends Decorator {
    public Gin(Offering offering) {
        super(offering);

    }

    public int getprice() {
        return offering.getprice()+ 60;
    }

    public String getname() {
        return offering.getname()+" with Gin";
    }
    
}
