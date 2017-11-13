package day06;

import java.util.*;

public class FileUpload {
	private static List<String> list=Arrays
			.asList("jpg","doc","rar","pdf","avi","java","txt","bmp");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(String str:args){
			String fileType=getFileType(str);
			if(list.contains(fileType)){
				System.out.println(str+"�ļ��Ϸ���");
			}else{
				System.out.println(str+"�ļ����Ϸ����������飡");
			}	
		}
	}
	public static String getFileType(String filename){
		int pos=filename.lastIndexOf(".");
		if(pos==-1){
			return null;
		}
		return filename.substring(pos+1);
	}

}
