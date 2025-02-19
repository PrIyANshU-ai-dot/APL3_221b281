public class LSingleton {
    private static LSingleton uniqueinstance;
    private LSingleton() {
    }
    public static LSingleton getInstance() {
        if(uniqueinstance == null) {
            uniqueinstance = new LSingleton();
        }
        return uniqueinstance;
    }
    public static void main(String[] args) {
        LSingleton s = LSingleton.getInstance();
        LSingleton s1 = LSingleton.getInstance();
        if(s == s1) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are different");
        }
    }
}
