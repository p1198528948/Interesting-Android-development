package test.collections;

import java.util.*;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> songs=new ArrayList<String>();//list和set都可用，但是list似乎更好
		
		Collections.addAll(songs, "听妈妈的话","see","某人","彩虹","Sugger","听说","fire");
		//排序
		Collections.sort(songs);//限制于list，set不可用的
		printList(songs);
	}
	public static void printList(Collection<String> c){//这里注意用的是不带“s”的,为易错点,不能理解
		//传入对象和传入接口各有什么特点，分别怎么用
		for(String str:c){
			System.out.println(str);
		}
	}
}
