package tech.xmcc.task;

import java.util.Scanner;

/**
 * ����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
 * A��90-100��B:80-89 ��C:70-79, D:60-69 ��E:0-59:
 * @author Administrator
 *
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		int a= scanner.nextInt();
		switch (a/10){
			case 9:
				System.out.println("��ĵȼ�Ϊ��A");
				break;
			case 8:
				System.out.println("��ĵȼ�Ϊ��B");
				break;
			case 7:
				System.out.println("��ĵȼ�Ϊ��C");
				break;
			case 6:
				System.out.println("��ĵȼ�Ϊ��D");
				break;
			default:
				System.out.println("��ĵȼ�Ϊ��E");
		}
				
				
	}
}
