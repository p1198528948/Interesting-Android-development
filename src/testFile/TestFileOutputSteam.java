package testFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputSteam {

	/**�������ʵ���˶�ȡĿ���ļ�ͼƬ���Ұ������Ƶ�Ŀ��·��
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("D:/javaFile/2015-8-23_17-31-39-431.BMP");
			fos=new FileOutputStream("D:/�½��ļ���/�����޸�.BMP");//ע������Ҫд��Ŀ���ļ������֣��״�
			byte[] buf=new byte[1024];
			int len=0;
			while((len=fis.read(buf))>=0){
				fos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
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
