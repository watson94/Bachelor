

Class A {
	final Object lock1 = new Object();
	final Object lock2 = new Object();
	void a() {
		Object lock;
		if (System.currentTimeMilis() % 10000 == 0) {
			lock = lock1;	
		} else {
			lock = lock2;
		}
		syncronized(lock) {
			// some code
		}
	}
}
