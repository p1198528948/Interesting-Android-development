package testFile;

import java.io.*;
public class TestWriteNum {

	/**写入了数字但是却占用了9个字节每位数字用一个字节表示，int型的数应该需要4个字节即可，这个改良了,但是显示：并无法认得
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fos =null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			fos=new FileOutputStream("D:/javaFile/写入数字占4字节.txt");
			dos=new DataOutputStream(fos);//这种传入一个对象，并扩大其功能是IO的主要思想
			dos.writeInt(245567768);
			dos.writeInt(121233434);
			dos.writeInt(12);
			dos.writeInt(99);
			dos.writeInt(1213098893);
			dos.writeInt(1213143523);
			dis=new DataInputStream(new FileInputStream("D:/javaFile/写入数字占4字节.txt"));
			int a=dis.readInt();
			System.out.println(a);
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());//一次性读了八个字节，得到了一组怪数
			System.out.println(dis.readInt());
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(dos!=null){
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
