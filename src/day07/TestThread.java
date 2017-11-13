package day07;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstThread ft=new FirstThread();
		ft.start();
		for(int i=0;i<100;i++){
			System.out.println("main:"+i);
		}
	}
	
}

class FirstThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("first:"+i);
		}
		
	}
}