package tech.xmcc.task;
/**
 * �������������� ��a��b����ֵ  
 * ���� int a=10,int b=15 �����ٶ�����������  ��������Ϊ a=15 b=10
 * @author Administrator
 *
 */
public class Test6 {
	public static void main(String[] args) {
		int a=10;
		int b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("����֮��a,b�ֱ�Ϊ��"+a+","+b);
	}
		

}
