package tech.xmcc.demo;
/**
 * ��ӡ1-100֮�ڵ�����,�������а���7��Ҫ����
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
