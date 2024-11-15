package com.demo;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class Logical {

	public static void main(String[] args) {

		/*
		 * int a = 98833; int sum = 0; while(a !=0) {
		 * 
		 * sum = sum + a % 2; a/=10; }
		 * 
		 * System.out.println(sum);
		 */

		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'l' };

		char[] ch2 = new char[20];

		char ch1 = 0;

		for (int i = 0; i < ch.length; i++) {

			if (i <= 2) {

				ch1 = ch[i];
				ch1 +=ch1;
				System.out.println(ch1);
			}

			else {
				
				for(int j=0;j<ch2.length;j++) {
					
					ch2[j] = ch[i];
					i++;
					//ch2[j]= ch1;
					System.out.println(ch2);
				}
			}
		}
	}

}
