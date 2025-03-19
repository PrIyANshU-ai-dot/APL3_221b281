package Bar;

abstract public class Beverage {
    protected void pour(int qty, String name) {
        System.out.println("Pour " + qty + " ml of " + name + " in the glass");
    }

    protected abstract void addContinent();

    protected void stir() {
    }

    private void serve() {
        System.out.println("Serve through waiter");
    }

    public void templateMethod(int qty, String name) {
        pour(qty, name);
        addContinent();
        stir();
        serve();
    }
}

class whiskey extends Beverage {

    protected void addContinent() {
        System.out.println("Add soda in the glass");
    }

    protected void stir() {
        System.out.println("stir for 25 seconds");
    }
}

class Beer extends Beverage {

    protected void addContinent() {
        System.out.println("no need to add anything in beer");
    }

}
