package tech.xmcc.task;
/**
 * 控制台输出九九乘法表
 * @author Administrator
 *
 */
public class task3 {
	public static void main(String[] args) {
		//外层循坏控制行数
		for (int i=1;i<10;i++){
			for (int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println("");
		}

	}

}
