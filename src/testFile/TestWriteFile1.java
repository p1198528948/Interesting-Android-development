package testFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteFile1 {

	/**写入了数字但是却占用了9个字节每位数字用一个字节表示，int型的数应该需要4个字节即可
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			fos=new FileOutputStream("D:/javaFile/写入数字但占9字节.txt");
			String str=String.valueOf(299987899);
			fos.write(str.getBytes(), 0, str.getBytes().length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
