package tech.xmcc.task;

public class task4 {
	public static void main(String[] args) {
		print(9);
	}
	static void print(int n){
		System.out.println("�봫��Ҫ��ӡ������");
		//���ѭ����������
		for (int i=1;i<=n;i++){
			//�м���Ϊ��n-1)/2+1
			if (i<=(n-1)/2+1){
				for (int j=1;j<=2*i-1;j++){
					System.out.print("*");
				}
			}else{
				for (int j=2*(n+1-i)-1;j>=1;j--){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
