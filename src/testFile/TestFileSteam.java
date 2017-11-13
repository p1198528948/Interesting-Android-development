package testFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileSteam {

	/**这个程序主要是读入文件然后下载控制台上
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\javaFile\\mms.txt");
			
			byte[] buf=new byte[1024];
			
			int len=0;
			while((len=fis.read(buf))>=0){
				System.out.write(buf, 0, len);	
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(fis!=null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
