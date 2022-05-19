package if_test;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class tset_py {
	public static void main(String[] args) throws IOException {
		
//		BufferedReader reader=new BufferedReader(
//			new FileReader("D:\\1.오후_취업반_유병현\\파이썬.txt")
//		);
//		
//		String str;
//		while((str = reader.readLine())!=null) {
//			System.out.println(str);
//		}
//		reader.close();


		Scanner scan=new Scanner(new File("D:\\1.오후_취업반_유병현\\파이썬.txt"));
		
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list3=new ArrayList<String>();
		char[] list2= {'a','e','i','o','u'};
		
		int count=0;
		int iaeou=0;
		int count2=0;
		
		
		while(scan.hasNext()) {
			String str=scan.next();
			if(str.length()>=6&&str.length()<=8) {
				list1.add(str);		
			}
		}
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list1.get(i).length(); j++) {
				//list1의 i번째인덱스 길이만큼 실행
				for(int k=j+1;k<list1.get(i).length();k++) {
					//j=list1의 i번째의0번째 인덱스 k=list1의 i번째의 1번째 인덱스부터 
					if(list1.get(i).charAt(j)==list1.get(i).charAt(k)) {
						//비교해서 같지않다면 추가
						list1.remove(i);
						
						count++;
						break;
					}
				}
				if(count==1) {
					i--;
					count=0;
					break;
				}
				
			}
			
		}
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list1.get(i).length(); j++) {
				//list1의 i번째인덱스 길이만큼 실행
				if(list1.get(i).charAt(j)==('i')||
					list1.get(i).charAt(j)==('a')||
					list1.get(i).charAt(j)==('e')||
					list1.get(i).charAt(j)==('o')||
					list1.get(i).charAt(j)==('u')||
					list1.get(i).charAt(j)==('I')||
					list1.get(i).charAt(j)==('A')||
					list1.get(i).charAt(j)==('E')||
					list1.get(i).charAt(j)==('O')||
					list1.get(i).charAt(j)==('U')) {
					
					iaeou++;
					System.out.println(list1.get(i));
					System.out.println("iaeou : "+iaeou);
					}
				
			}
			if(iaeou!=4) {
				System.out.println("제거된 값 : "+list1.get(i));
				list1.remove(i);
				count2++;
			}
			iaeou=0;
			if(count2==1) {
				i--;
				count2=0;
			}
			
		}
		
		System.out.println(list1);
		System.out.println(list1.size());
	}
}
		
		
		
		



//	for(int i=0; i<=list1.size();i++) {
//	
//	for(int j=0;j<=[i];j++) {
//		if(list1.i.)
//	}
//}
//for(String a:list1) {
//	if(a.length()>=6&&a.length()<=8) {
//		list2.add(a);
//		System.out.println(a);
		
		//str2=list2.toString();
		
		
//		String[] strArray=str2.split("");
//		for(String s :strArray) {
//			//System.out.println(s);
//			for(int i=0; i<=s.length(); i++) {
//				
//				for(int j=0; j<=s.length();j++) {
//					
//					if(!s.equals(s)) {
//						
//						list3.add(s);
//						System.out.println(s);
//					}
//				}
//			}
//			
//		}


//for(int j=list1.get(i).length();j<=0; j--) {
////list1의 i번째인덱스 길이만큼 실행
//for(int k=list1.get(i).length();k<=0;k--) {
//	//j=list1의 i번째의0번째 인덱스 k=list1의 i번째의 1번째 인덱스부터 
//	if(list1.get(i).charAt(j-1)!=list1.get(i).charAt(k-2)) {
//		//비교해서 같지않다면 추가
//		
//		list2.add(list1.get(i));
//		System.out.println(list2.size());
//	}
//}
//}








