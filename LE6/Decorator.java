public class Decorator extends Offering{
    Offering offering;
    public Decorator(Offering offering){
        this.offering = offering;
    }
    int getprice(){
        return offering.getprice();
    }
    String getname(){
        return offering.getname();
    }
    
}
