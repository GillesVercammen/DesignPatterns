package ap.examen;

public class HighThread extends Thread {

	private CounterSingleton inputCounter;

	public HighThread(CounterSingleton counter)
	{
		inputCounter = counter;

		this.setPriority(Thread.MAX_PRIORITY);
	}
	
	public void run() {

		inputCounter.increment(1);
	}
}
