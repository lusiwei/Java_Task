package tech.xmcc.task;

public class task4 {
	public static void main(String[] args) {
		print(9);
	}
	static void print(int n){
		System.out.println("请传入要打印的行数");
		//外层循环控制行数
		for (int i=1;i<=n;i++){
			//中间行为（n-1)/2+1
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
