package testFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TsetBufferedStream {

	/**什么叫做装饰着模式，这个程序拷贝了文件
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			fis=new FileInputStream("D:/javaFile/2015-8-23_17-31-39-431.BMP");
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(new FileOutputStream("D:/javaFile/Q/文件名不可掉.BMP"));
			byte[] buf=new byte[1024];
			int len=0;
			while((len=bis.read(buf))>=0){//这里易错
				bos.write(buf,0,len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//当close时自动flush
			try {
				if(bis!=null)
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bos!=null)
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
