package day05;

public class Tset001 {

	
	public static void main(String[] args) {
		
		
			
				
					try {
						buyPants(-1);
					} catch (PantsException e) {
						
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println(e.getMessage()+"\t"+e.toString());
					}
					System.out.println("---");
					try {
						buyCloth(-22);
					} catch (ClothException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					System.out.println("over");
					try {
						//new TipInfo().A(2);
						new TipInfo().A(1);
					} catch (MyException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					System.out.println("a:"+new TipInfo().fac(3));
	}
	
	public  static void buyCloth (double size) throws ClothException{
		if(size<=0){
			throw new ClothException("衣服尺寸有误！！！");
		}
		
		System.out.println("衣服尺码为："+size);
	}
	
	
	public  static void buyPants (double size) {  //RuntimeException自动抛出，但任然需要人为解决
		if(size<=0){
			throw new PantsException("Pants尺寸有误！！！");
		}
		
		System.out.println("Pants尺码为："+size);
	}
}
