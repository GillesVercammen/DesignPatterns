package ap.examen;

public class LowThread implements Runnable {

	private Counter inputCounter;

	public LowThread(Counter counter) {
		inputCounter = counter;
	}
	
	public void run() {

		inputCounter.increment(1);
	}
}
