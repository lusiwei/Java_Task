package tech.xmcc.demo;
/**
 * �ҹ����ɽ������������壬8848�ס���������һ���㹻���ֽ�����ĺ����0.01�ס����ʣ����۵����ٴΣ������۳����������ĸ߶�
 * @author Administrator
 *
 */
public class Test3 {
	final double h=8848.0;
	static double h1=0.01;//�����ʼ�߶�
	static int i=0;
	public static void main(String[] args){	
		do {
			i++;
			h1=0.01*(Math.pow(2.0, i));
//			System.out.println(h1);
		}while(h1<8848.0);
		
		System.out.println(i);
		
	}
}
