package ap.examen;

public class CounterSingleton {

	private volatile static CounterSingleton uniqueInstance;
	private int count;
	
	private CounterSingleton() {}

	public static CounterSingleton getInstance(){
		if (uniqueInstance == null){
			synchronized (CounterSingleton.class){
				if (uniqueInstance == null){
					uniqueInstance = new CounterSingleton();
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
