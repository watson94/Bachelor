public class A {
    private static Object o;
    private final static Object LOCK = new Object();
    public void a() {
        synchronized (LOCK) {
            //operations with o
        }
    }
    public synchronized void b() {
        synchronized (LOCK) {
            //operations with o
        }
    }
}
