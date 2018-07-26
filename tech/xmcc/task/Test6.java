package tech.xmcc.task;
/**
 * 不适用其他变量 将a跟b交换值  
 * 例如 int a=10,int b=15 不能再定义其他类型  交换后结果为 a=15 b=10
 * @author Administrator
 *
 */
public class Test6 {
	public static void main(String[] args) {
		int a=10;
		int b=15;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("交换之后a,b分别为："+a+","+b);
	}
		

}
