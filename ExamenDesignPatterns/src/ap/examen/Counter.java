package ap.examen;

public class Counter {

	private volatile static Counter uniqueInstance;
	private int count;
	
	private Counter() {}

	public static Counter getInstance(){
		if (uniqueInstance == null){
			synchronized (Counter.class){
				if (uniqueInstance == null){
					uniqueInstance = new Counter();
				}
			}
		}
		return uniqueInstance;
	}
	
	public void increment(int i) {
			count += i;
	}
	
	public int getCount() {
		return count;
	}
}
