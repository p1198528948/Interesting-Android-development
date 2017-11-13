package testFile;

import java.io.*;

public class TestFile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("D:/javaFile/1.txt");//注意这里要将你需要创建的文件写好
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//f.delete();
		System.out.println(f.getParent());
		System.out.println(f.exists());
		File f1=new File("D:\\javaFile\\a\\b\\c");//ctrl+f替换
		f1.mkdirs();
	}

}
