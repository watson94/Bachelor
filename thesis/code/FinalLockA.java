public class A {
    final B b = new B();
    public void a() {
        synchronized (b.lock) {
            /*some code*/
        }
    }
}
