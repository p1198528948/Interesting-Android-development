package testFile;

import java.io.File;

import java.io.FilenameFilter;

public class TestFile3 {

	/**显示了文件完整路径
	 * @param args
	 */
	public static void main(String[] args) {
		new TestFile3().run();
	}
	public void run(){
		File f02=new File("D:/javaFile");//应为文件目录
		File[] str=f02.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("")) return true;
				return false;
			}
		});
		for(File st:str){
			System.out.println(st);
		}
	}

}
