package testFile;

import java.io.*;

public class TestFile2 {

	/**�������������������ҵ��ļ���
	 * @param args
	 */
	public static void main(String[] args) {
		new TestFile2().run();//ע����static�����е��÷�static����������
	}
	
	public void run(){
		File f01=new File("D:/javaFile");//ӦΪ�ļ�Ŀ¼
		String[] fns=f01.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				
				if(name.endsWith("")) return true;
				return false;
			}
		});//������д��һ�������ֻ࣬��ĳ������ʹ����һ�Σ���ȻҲ��д���ڲ��࣬�ڲ��������ߴ��밡��ȫ��
		for(String fn:fns){
			System.out.println(fn);
		}
	}
	
}
