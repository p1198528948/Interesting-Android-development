package day05;

public class TipInfo {
	public void A(int a) throws MyException{
		switch(a){
		case 0: 	throw new MyException("默认");
		case 1:		throw new MyException("握手成功|写成功|置位成功|复位成功");
		case 2:		throw new MyException("读成功");
		case 160:	throw new MyException("接收错误");
		case 161:	throw new MyException("接收校验错误");
		case 162:	throw new MyException("通讯超时");
		case 255:	throw new MyException("正在通讯"); 
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
