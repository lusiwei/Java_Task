package tech.xmcc.demo;
/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,4};
		//
		int n=0;
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length;j++){
				for (int k=0;k<arr.length;k++){
					if (arr[i]!=arr[j]&&arr[i]!=arr[k]&&arr[j]!=arr[k]){
						n++;
						System.out.println(arr[i]+""+arr[j]+""+arr[k]);
					}
				}
			}
		}
		System.out.println(n);
	}
}
