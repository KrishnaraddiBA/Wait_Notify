package Wait_notify;

public class E extends Thread{
	int total=0;
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			total=total+i;
		}
		notify();
	}
	

	

}
