package test.collections;

import java.util.*;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> songs=new ArrayList<String>();//list��set�����ã�����list�ƺ�����
		
		Collections.addAll(songs, "������Ļ�","see","ĳ��","�ʺ�","Sugger","��˵","fire");
		//����
		Collections.sort(songs);//������list��set�����õ�
		printList(songs);
	}
	public static void printList(Collection<String> c){//����ע���õ��ǲ�����s����,Ϊ�״��,�������
		//�������ʹ���ӿڸ���ʲô�ص㣬�ֱ���ô��
		for(String str:c){
			System.out.println(str);
		}
	}
}
