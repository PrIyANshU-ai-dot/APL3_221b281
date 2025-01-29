abstract class Voice {
    public final void templateMethod() {
        initialize();
        start();
        stop();
    }

    protected abstract void initialize();
    protected abstract void start();
    protected abstract void stop();
}

public class Voice2 extends Voice {
    @Override
    protected void initialize() {
        System.out.println("Initializing Voice2...");
    }

    @Override
    protected void start() {
        System.out.println("Starting Voice2...");
    }

    @Override
    protected void stop() {
        System.out.println("Stopping Voice2...");
    }

    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();
    }
}