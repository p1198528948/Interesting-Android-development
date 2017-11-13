package testFile;
import java.io.File;
import java.io.FileFilter;
public class TestFile4 {

	/**过滤得到文件夹
	 * @param args
	 */
	public static void main(String[] args) {
		new TestFile4().run();
	}

	private void run() {
		File f03=new File("D:/javaFile");//应为文件目录
		File[] str=f03.listFiles(new DirFilter());
		for(File f:str){
			System.out.println(f.getName());
		}
	}
	//使用了内部类
	private class DirFilter implements FileFilter{
		public boolean accept(File pathname) {
			if(pathname.isDirectory()) return true;
			return false;
		}
	}
}
