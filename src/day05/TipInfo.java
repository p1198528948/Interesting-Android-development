package day05;

public class TipInfo {
	public void A(int a) throws MyException{
		switch(a){
		case 0: 	throw new MyException("Ĭ��");
		case 1:		throw new MyException("���ֳɹ�|д�ɹ�|��λ�ɹ�|��λ�ɹ�");
		case 2:		throw new MyException("���ɹ�");
		case 160:	throw new MyException("���մ���");
		case 161:	throw new MyException("����У�����");
		case 162:	throw new MyException("ͨѶ��ʱ");
		case 255:	throw new MyException("����ͨѶ"); 
		default:;
		}
		
	}
	/*n!
	 * */
	
	public int fac(int x){
		if(x==1){
			return 1;
		}
		else{
			return x*fac(x-1);
		}
	}
	
	
}
