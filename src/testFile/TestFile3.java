package testFile;

import java.io.File;

import java.io.FilenameFilter;

public class TestFile3 {

	/**��ʾ���ļ�����·��
	 * @param args
	 */
	public static void main(String[] args) {
		new TestFile3().run();
	}
	public void run(){
		File f02=new File("D:/javaFile");//ӦΪ�ļ�Ŀ¼
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
