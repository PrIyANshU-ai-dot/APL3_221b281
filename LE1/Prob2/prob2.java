class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class prob2 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.show();

        Child child = new Child();
        child.show();
    }
}