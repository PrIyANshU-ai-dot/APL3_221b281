class Mother {
    void show() {
        System.out.println("Mother's show()");
    }
//     static void show() {
//         System.out.println("Mother's show()");
//     }
}

class Child extends Mother {
    void show() {
        System.out.println("Child's show()");
    }
    // static void show() {
    //     System.out.println("Child's show()");
    // }
}

public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); 
    }
}