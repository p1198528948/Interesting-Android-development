package testFile;

import java.io.*;

public class TestFile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("D:/javaFile/1.txt");//ע������Ҫ������Ҫ�������ļ�д��
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//f.delete();
		System.out.println(f.getParent());
		System.out.println(f.exists());
		File f1=new File("D:\\javaFile\\a\\b\\c");//ctrl+f�滻
		f1.mkdirs();
	}

}
