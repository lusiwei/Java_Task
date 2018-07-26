package tech.xmcc.task;

public class Task1 {
	public static void main(String[] args) {
		print();
	}
/**
 * 打印水仙花数
 */
	static void print(){
		int i,j,k;
		for (i=1;i<10;i++){
			for (j=0;j<10;j++){
				for (k=0;k<10;k++){
					int number = i*100+j*10+k;
					if ((i*i*i+j*j*j+k*k*k)==(i*100+j*10+k)){
						System.out.println("水仙花数为："+number);
					}        
				}
			}
		}
	}
	
}
