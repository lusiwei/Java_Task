package tech.xmcc.task;

import java.util.Scanner;

/**
 * 可以从控制台连续输入数字，当输入的数字为0时不可以再输入
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		while (true){
			System.out.println("请输入数字:");
			int number =scanner.nextInt();
			if (number ==0){
				System.out.println("你不能再输入数字了");
				break;
			}
		}
		
	}

}
