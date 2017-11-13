package day03;
//j2se学完要会编辑比这个还要复杂的程序和游戏
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
		//创建窗体
		JFrame frame=new JFrame();
		//创建面板
		MyPanel panel=new MyPanel();
		//给窗体添加颜色
		//panel.setBackground(Color.pink);
		//把面板增加到窗体上
		frame.add(panel);
		//设置窗体的宽和高
		frame.setSize(462,656);
		//添加标题
		frame.setTitle("猜字母游戏");
		//让窗体居中显示
		frame.setLocationRelativeTo(null);
		//当关闭窗体时，退出整个程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗体显示的方法
		frame.setVisible(true);
		frame.addKeyListener(panel);
		//创建对象，注意括号里的内容
		Thread thread=new Thread(panel);
		//这里使用start开启线程
		thread.start();
	}

}
//创建一个自定义面板，在该面板上课可以进行绘制,这里使用了Runnable接口实现多线程
class MyPanel extends JPanel implements Runnable,KeyListener{//JPanel 作为父类，我们
	//并没有去编写它，我们直接将他加入过来，见前面的import
	
	
	private static final long serialVersionUID = 7749584091684256569L;
	char chs[]=new char [10];//定义一个char类型的数组存放下落的字符
	int x[]=new int [10];//定义存放字母x，y坐标的数组
	int y[]=new int [10];
	boolean []flag;//定义boolean类型的数组看该字母是否被使用过
	int score=0;//定义分数等级并赋初值
	int grade=1;
	BufferedImage image;//背景图片
	int speed=70;//字母下落的速度
	char letters[];//定义26个大写字母数组，便于从中取10个随机的字母
	int [] indexs=new int [10];//存放10个字母的索引
	Random random=new Random();
	
	public MyPanel() throws Exception{
		letters=new char[26];//定义一个26个容量的字符的数组
		flag=new boolean[26];//定义一个26个boolean类型的数组存储该字母是否被使用过
		for(int i=0;i<letters.length;i++){
			letters[i]=(char)('A'+i);//强制转换类型
		}
			image=ImageIO.read(new File("img/image.png"));
			for (int i=0;i<chs.length;i++){
				x[i]=random.nextInt(430);
				y[i]=random.nextInt(400);
				int index;//定义一个随机索引
				do{
					index=(int)(Math.random()*26);
				}while(flag[index]);
				/*
				 * 当数组的下标出为false时，就会走这一步，把26个字母的index处的字母赋给下落数组的第一个元素
				 * 然后把flag数组的当前位置置为true，表示该字母已经那个被使用过，下次不能再取该字母
				 */
				chs[i]=letters[index];
				flag[index]=true;
				/*
				 * 记录每个字母下落在26个字母数组中的下标从而判断用户输入的时候是否有重复输入
				 */
				indexs[i]=index;	
		}		
	}	
	public void paint(Graphics g){   //绘制的方法
		super.paint(g);//调用父类的paint方法
		g.drawImage(image, 0, 0, 462, 656, null);//把背景图绘制到面板上
		g.setColor(Color.blue);//给画笔设置颜色
		Font font=new Font("微软雅黑",Font.BOLD,30);//给画笔设置字体，画笔就以该字体进行绘制
		g.setFont(font);
		//通过循环把每个字母绘制到面板上
		for (int i=0;i<chs.length;i++){
			g.drawString(chs[i]+"", x[i], y[i]);
		}
		g.setColor(Color.red);//给画笔设置红色；
		//分别绘制分数和等级
		g.drawString("分数："+score, 10, 30);
		g.drawString("等级："+grade, 300, 30);
	}
	@Override
	public void run() {
		while(true){
			for(int i=0;i<chs.length;i++){
				y[i]++;
				if(y[i]>650){
					JOptionPane.showMessageDialog(null,"GameOver");
					System.exit(0);//游戏结束
				}
			}
			try{
			Thread.sleep(speed);
			repaint();//尽快调用paint方法
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
		
	}
	//用户按下键盘时触发该事件
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c=e.getKeyChar();
		//判断输入的字符是否和10个字母数组中任意的一个相等
		for(int i=0;i<chs.length;i++){
			if(c==chs[i]){
				int index=indexs[i];//获取字母在26个字母数组中的下标
				flag[index]=false;
				score+=50;//敲对一个加50分
				//随机生成新字母的x，y坐标
				x[i]=random.nextInt(430);
				y[i]=random.nextInt(400);
				while(true){
					//生成随机索引
					int index1=(int)(Math.random()*26);
					//当生成的随机索引为false时，可以得到该字母赋值给10个字母数组的一个
					if(!flag[index1]){
						chs[i]=letters[index1];
						flag[index1]=true;
						indexs[i]=index;
						break;
					}
				}
			}
			
		}
		//当分数为1000时，等级为2
		if(score==1000){
			grade=2;
			speed=50;//速度加快
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







