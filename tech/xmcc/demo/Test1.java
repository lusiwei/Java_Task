package tech.xmcc.demo;

public class Test1 {
	// ����1-100֮�������
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
				System.out.println("��ӡ"+j);
			}
		}
		System.out.println("����Ϊ"+n);
	}
	
}
