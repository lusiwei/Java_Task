package tech.xmcc.demo;
/**
 * ��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
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
