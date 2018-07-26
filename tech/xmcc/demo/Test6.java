package tech.xmcc.demo;
import java.util.*;
public class Test6 {
	public static void main (String [] args){
		Scanner scanner=new Scanner(System.in);
		int r=(int)(Math.random()*100+1);
		System.out.println("请输入一个小于100的整数");
		int i=scanner.nextInt();
		if (i<r){
			System.out.println("你输入的数小了");
		}else if(i>r){
			System.out.println("你输入的数大了");
		}
	}
}
