package testFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteFile1 {

	/**д�������ֵ���ȴռ����9���ֽ�ÿλ������һ���ֽڱ�ʾ��int�͵���Ӧ����Ҫ4���ֽڼ���
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			fos=new FileOutputStream("D:/javaFile/д�����ֵ�ռ9�ֽ�.txt");
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
