package testFile;

import java.io.*;

public class TestFile2 {

	/**这个是用来返回你想查找的文件的
	 * @param args
	 */
	public static void main(String[] args) {
		new TestFile2().run();//注意在static方法中调用非static方法的问题
	}
	
	public void run(){
		File f01=new File("D:/javaFile");//应为文件目录
		String[] fns=f01.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				
				if(name.endsWith("")) return true;
				return false;
			}
		});//这里我写了一个匿名类，只是某个方法使用了一次，当然也可写作内部类，内部类可以提高代码啊安全性
		for(String fn:fns){
			System.out.println(fn);
		}
	}
	
}
