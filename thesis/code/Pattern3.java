public class A {
    private static Object o;
    private final Lock lock = new ReentrantLock();
    public void a() {
        lock.lock();
        try {
           //operations with o
        } finally {
           lock.unlock();
        }
    }
}
