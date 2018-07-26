package tech.xmcc.demo;

public class Test1 {
	// 计算1-100之间的质数
	public static void main (String[] args){
		int n=0;
		for (int j=1;j<101;j++){
			int i =0;
			for (int k=1;k<=j;k++){
				if (j%k==0){
					i++;
				}
			}
			if (i==2){
				n++;
				System.out.println("打印"+j);
			}
		}
		System.out.println("个数为"+n);
	}
	
}
