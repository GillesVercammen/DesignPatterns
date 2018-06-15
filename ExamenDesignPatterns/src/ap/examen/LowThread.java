package ap.examen;

public class LowThread implements Runnable {

	private CounterSingleton inputCounter;

	public LowThread(CounterSingleton counter) {
		inputCounter = counter;
	}
	
	public void run() {

		inputCounter.increment(1);
	}
}
