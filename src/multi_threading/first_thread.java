package multi_threading;

public class first_thread extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
			first_thread f = new first_thread();
			f.start();
		}
		
		

	}

}
