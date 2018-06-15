package ap.examen;

public class Main {

    public static void main(String[] args) {
        int times = 10000;
        HighThread[] h = new HighThread[times];
        Thread[] t = new Thread[times];

        Counter mainCounter = new Counter();

        for(int i = 0; i < times; i++) {


            h[i] = new HighThread(mainCounter);
            LowThread low = new LowThread(new Counter());


            t[i] = new Thread(low);
            t[i].setPriority(Thread.MIN_PRIORITY);
            t[i].start();
            h[i].start();
        }

        for(int j = 0; j < times; j++) {
            try {
                h[j].join();
                t[j].join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Counter Value is : " + mainCounter.getCount());
    }
}
