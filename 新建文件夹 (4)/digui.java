package Digui;

import java.io.File;

public class digui {
public static void main(String[] args) {
	File file=new File("f:\\123");
	listAllFile(file);
	
}

private static void listAllFile(File file) {
	// TODO Auto-generated method stub
	File[]strs=file.listFiles();
	for(int i=0;i<strs.length;i++)
	{
		if(strs[i].isDirectory())
	{    listAllFile(strs[i]);
	System.out.println("Ŀ¼="+strs[i].getName());
		
	}else {
		System.out.println("�ļ���="+strs[i].getName());
	}
}
}
}