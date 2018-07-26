package tech.xmcc.demo;
/**
 * 我国最高山峰是珠穆朗玛峰，8848米。现在我有一张足够大的纸，它的厚度是0.01米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度
 * @author Administrator
 *
 */
public class Test3 {
	final double h=8848.0;
	static double h1=0.01;//定义初始高度
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
