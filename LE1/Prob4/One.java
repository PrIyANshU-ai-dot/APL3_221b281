class One {
    int x;

    public One(int x) {
        this.x = x;
    }
}

class Two extends One {
    public Two(int x) {
        super(x);
    }
}

class prob4 {
    public static void main(String[] args) {
        Two two = new Two(5);
        System.out.println(two.x);
    }
}