package tech.xmcc.demo;
import java.util.*;
public class Test6 {
	public static void main (String [] args){
		Scanner scanner=new Scanner(System.in);
		int r=(int)(Math.random()*100+1);
		System.out.println("������һ��С��100������");
		int i=scanner.nextInt();
		if (i<r){
			System.out.println("���������С��");
		}else if(i>r){
			System.out.println("�������������");
		}
	}
}
