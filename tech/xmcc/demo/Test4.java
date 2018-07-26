package tech.xmcc.demo;
/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
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
