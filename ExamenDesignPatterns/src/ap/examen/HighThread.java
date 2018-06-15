package ap.examen;

public class HighThread extends Thread {

	private Counter inputCounter;

	public HighThread(Counter counter)
	{
		inputCounter = counter;

		this.setPriority(Thread.MAX_PRIORITY);
	}
	
	public void run() {

		inputCounter.increment(1);
	}
}
