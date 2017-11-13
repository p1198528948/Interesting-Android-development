package day07;

public class TestThread01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestThread01().run();
	}
	
	public void run(){
		MyRunnable mt=new MyRunnable();
		Thread td=new Thread(mt);
		td.start();
		for(int i=0;i<100;i++){
			System.out.println("main:"+i);
		}
	}
	//这是一个内部类
	class MyRunnable implements Runnable{
		public void run() {
			for(int i=0;i<100;i++){
				System.out.println("Run:"+i);
			}
		}
	
	}
}
