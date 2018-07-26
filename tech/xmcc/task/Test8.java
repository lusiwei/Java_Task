package tech.xmcc.task;

import java.util.Scanner;

/**
 * 输入一个成绩a，使用switch结构求出a的等级。
 * A：90-100，B:80-89 ，C:70-79, D:60-69 ，E:0-59:
 * @author Administrator
 *
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int a= scanner.nextInt();
		switch (a/10){
			case 9:
				System.out.println("你的等级为：A");
				break;
			case 8:
				System.out.println("你的等级为：B");
				break;
			case 7:
				System.out.println("你的等级为：C");
				break;
			case 6:
				System.out.println("你的等级为：D");
				break;
			default:
				System.out.println("你的等级为：E");
		}
				
				
	}
}
