package tech.xmcc.demo;
/**
 * 打印1-100之内的整数,但数字中包含7的要跳过
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		for (int i=1;i<101;i++){
			String s=""+i;
			if (s.contains("7")){
				continue;
			}else{
				System.out.println(i);
			}							
		}
	}
}
