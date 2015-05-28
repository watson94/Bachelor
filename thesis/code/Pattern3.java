public class A {
    private static Object o;
    private final Lock lock = new ReentrantLock();
    public void a() {
        try {
           lock.lock();
           //operations with o
        } finally {
           lock.unlock();
        }

    }
}
