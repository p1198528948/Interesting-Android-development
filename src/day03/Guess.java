package day03;
//j2seѧ��Ҫ��༭�������Ҫ���ӵĳ������Ϸ
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.*;
import java.io.File;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Guess {
	public static void main(String[]args)
	throws Exception{
		//��������
		JFrame frame=new JFrame();
		//�������
		MyPanel panel=new MyPanel();
		//�����������ɫ
		//panel.setBackground(Color.pink);
		//��������ӵ�������
		frame.add(panel);
		//���ô���Ŀ�͸�
		frame.setSize(462,656);
		//��ӱ���
		frame.setTitle("����ĸ��Ϸ");
		//�ô��������ʾ
		frame.setLocationRelativeTo(null);
		//���رմ���ʱ���˳���������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ʾ�ķ���
		frame.setVisible(true);
		frame.addKeyListener(panel);
		//��������ע�������������
		Thread thread=new Thread(panel);
		//����ʹ��start�����߳�
		thread.start();
	}

}
//����һ���Զ�����壬�ڸ�����Ͽο��Խ��л���,����ʹ����Runnable�ӿ�ʵ�ֶ��߳�
class MyPanel extends JPanel implements Runnable,KeyListener{//JPanel ��Ϊ���࣬����
	//��û��ȥ��д��������ֱ�ӽ��������������ǰ���import
	
	
	private static final long serialVersionUID = 7749584091684256569L;
	char chs[]=new char [10];//����һ��char���͵�������������ַ�
	int x[]=new int [10];//��������ĸx��y���������
	int y[]=new int [10];
	boolean []flag;//����boolean���͵����鿴����ĸ�Ƿ�ʹ�ù�
	int score=0;//��������ȼ�������ֵ
	int grade=1;
	BufferedImage image;//����ͼƬ
	int speed=70;//��ĸ������ٶ�
	char letters[];//����26����д��ĸ���飬���ڴ���ȡ10���������ĸ
	int [] indexs=new int [10];//���10����ĸ������
	Random random=new Random();
	
	public MyPanel() throws Exception{
		letters=new char[26];//����һ��26���������ַ�������
		flag=new boolean[26];//����һ��26��boolean���͵�����洢����ĸ�Ƿ�ʹ�ù�
		for(int i=0;i<letters.length;i++){
			letters[i]=(char)('A'+i);//ǿ��ת������
		}
			image=ImageIO.read(new File("img/image.png"));
			for (int i=0;i<chs.length;i++){
				x[i]=random.nextInt(430);
				y[i]=random.nextInt(400);
				int index;//����һ���������
				do{
					index=(int)(Math.random()*26);
				}while(flag[index]);
				/*
				 * ��������±��Ϊfalseʱ���ͻ�����һ������26����ĸ��index������ĸ������������ĵ�һ��Ԫ��
				 * Ȼ���flag����ĵ�ǰλ����Ϊtrue����ʾ����ĸ�Ѿ��Ǹ���ʹ�ù����´β�����ȡ����ĸ
				 */
				chs[i]=letters[index];
				flag[index]=true;
				/*
				 * ��¼ÿ����ĸ������26����ĸ�����е��±�Ӷ��ж��û������ʱ���Ƿ����ظ�����
				 */
				indexs[i]=index;	
		}		
	}	
	public void paint(Graphics g){   //���Ƶķ���
		super.paint(g);//���ø����paint����
		g.drawImage(image, 0, 0, 462, 656, null);//�ѱ���ͼ���Ƶ������
		g.setColor(Color.blue);//������������ɫ
		Font font=new Font("΢���ź�",Font.BOLD,30);//�������������壬���ʾ��Ը�������л���
		g.setFont(font);
		//ͨ��ѭ����ÿ����ĸ���Ƶ������
		for (int i=0;i<chs.length;i++){
			g.drawString(chs[i]+"", x[i], y[i]);
		}
		g.setColor(Color.red);//���������ú�ɫ��
		//�ֱ���Ʒ����͵ȼ�
		g.drawString("������"+score, 10, 30);
		g.drawString("�ȼ���"+grade, 300, 30);
	}
	@Override
	public void run() {
		while(true){
			for(int i=0;i<chs.length;i++){
				y[i]++;
				if(y[i]>650){
					JOptionPane.showMessageDialog(null,"GameOver");
					System.exit(0);//��Ϸ����
				}
			}
			try{
			Thread.sleep(speed);
			repaint();//�������paint����
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
		
	}
	//�û����¼���ʱ�������¼�
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c=e.getKeyChar();
		//�ж�������ַ��Ƿ��10����ĸ�����������һ�����
		for(int i=0;i<chs.length;i++){
			if(c==chs[i]){
				int index=indexs[i];//��ȡ��ĸ��26����ĸ�����е��±�
				flag[index]=false;
				score+=50;//�ö�һ����50��
				//�����������ĸ��x��y����
				x[i]=random.nextInt(430);
				y[i]=random.nextInt(400);
				while(true){
					//�����������
					int index1=(int)(Math.random()*26);
					//�����ɵ��������Ϊfalseʱ�����Եõ�����ĸ��ֵ��10����ĸ�����һ��
					if(!flag[index1]){
						chs[i]=letters[index1];
						flag[index1]=true;
						indexs[i]=index;
						break;
					}
				}
			}
			
		}
		//������Ϊ1000ʱ���ȼ�Ϊ2
		if(score==1000){
			grade=2;
			speed=50;//�ٶȼӿ�
		}
		else if(score==1500){
			grade=3;
		   speed=20;}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {		
	}
}







