class Mother {
    int x;

    void show() {
        System.out.println("Show method in Mother class");
    }
}

class Child extends Mother {
    //empty 
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}