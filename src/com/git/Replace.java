package com.git;
import java.util.Scanner;
public class Replace {


	// Java Program to replace lower-case characters with upper-case and vice-versa

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string");
			String str = sc.nextLine();
			StringBuffer sb = new StringBuffer(str);
			for(int i=0; i< str.length(); i++)
			{
			if(Character.isLowerCase(str.charAt(i)))
					{
				     sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
					}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			}
			System.out.println("chaged case: " + sb);
		}

	


}
