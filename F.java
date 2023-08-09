package Wait_notify;

public class F {
	public static void main(String[] args) {
		E e1= new E();
		e1.start();
		synchronized (e1) {
			try {
				e1.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(e1.total);
	}

}
