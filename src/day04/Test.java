package day04;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame(args[0]);
		frame.setSize(432, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // ʹ������ʾ����Ļ����
		frame.setVisible(true);
	}
}

