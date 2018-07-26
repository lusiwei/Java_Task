package tech.xmcc.demo;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a=scanner.nextInt();
		
		for (int i=0;i<=a;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
