package testFile;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class TestWriteFile {

	/**
	 * 写的是.txt文件
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			fos=new FileOutputStream("D:/javaFile/这是一个实验_"+System.currentTimeMillis());
			List<StringBuffer>  sbu = new ArrayList<>();
			sbu.add(new StringBuffer().append("34"));
			sbu.add(new StringBuffer().append("5345"));
			sbu.add(new StringBuffer().append("EF0F"));
			byte[] buf;
			byte[] const_buf = "\n".getBytes();
			for(int index = 0 ;index<sbu.size();index ++){
				buf=sbu.get(index).toString().getBytes();
				fos.write(buf, 0, buf.length);
				fos.write(const_buf,0,const_buf.length);
			}	
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
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
