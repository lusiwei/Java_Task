package tech.xmcc.demo;
/**
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 * @author Administrator
 *
 */
public class Test4 {
	public int n=0;
	public static void main (String [] args){
		sum(5);	
		System.out.println(sum(8));
	}
	static int sum (int month){
		if (month==1||month==2){
			return 1;
		}else{
			return sum(month-1)+sum(month-2);
			
		}
	}
	
}
