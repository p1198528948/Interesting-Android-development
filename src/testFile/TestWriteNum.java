package testFile;

import java.io.*;
public class TestWriteNum {

	/**д�������ֵ���ȴռ����9���ֽ�ÿλ������һ���ֽڱ�ʾ��int�͵���Ӧ����Ҫ4���ֽڼ��ɣ����������,������ʾ�����޷��ϵ�
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fos =null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			fos=new FileOutputStream("D:/javaFile/д������ռ4�ֽ�.txt");
			dos=new DataOutputStream(fos);//���ִ���һ�����󣬲������书����IO����Ҫ˼��
			dos.writeInt(245567768);
			dos.writeInt(121233434);
			dos.writeInt(12);
			dos.writeInt(99);
			dos.writeInt(1213098893);
			dos.writeInt(1213143523);
			dis=new DataInputStream(new FileInputStream("D:/javaFile/д������ռ4�ֽ�.txt"));
			int a=dis.readInt();
			System.out.println(a);
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());//һ���Զ��˰˸��ֽڣ��õ���һ�����
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
