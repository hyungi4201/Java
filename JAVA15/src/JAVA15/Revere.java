package JAVA15;

import java.util.Scanner;

public class Revere {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하시오 : ");
		s = sc.next();
		
		System.out.println(reverse(s));
	}
	
	static String reverse(String str) {
		String result = "";
		
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}
