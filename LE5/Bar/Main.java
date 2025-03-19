package Bar;

class Main{
    public static void main(String[] args){
        Beverage b = new whiskey();
        b.templateMethod(30,"whiskey");
        b = new Beer();
        b.templateMethod(200,"Beer");
    }
}
