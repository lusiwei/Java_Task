package tech.xmcc.task;

import java.util.Scanner;

/**
 * ���Դӿ���̨�����������֣������������Ϊ0ʱ������������
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		while (true){
			System.out.println("����������:");
			int number =scanner.nextInt();
			if (number ==0){
				System.out.println("�㲻��������������");
				break;
			}
		}
		
	}

}
