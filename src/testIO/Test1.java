package testIO;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	/**在控制台输入什么即可输出什么
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStream is=System.in;
			while(true){
				byte[] buf=new byte[1024];
				int len=0;
				while((len=is.read(buf))>0){
					System.out.write(buf, 0, len);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
