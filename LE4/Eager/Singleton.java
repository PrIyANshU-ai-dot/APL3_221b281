public class Singleton {
    private static Singleton uniqueinstance = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        
        return uniqueinstance;
    }
}
class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        if(s == s1) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are different");
        }
    }
    
}