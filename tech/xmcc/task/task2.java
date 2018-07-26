package tech.xmcc.task;
/**
 * 5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。现在用100文钱买100只鸡，那么各有公鸡、母鸡、雏鸡多少只？请编写程序实现。
 * 这是经典的"百马百担"问题，有一百匹马，驮一百担货，大马驮3担，中马驮2担，两只小马驮1担，问有大，中，小马各几匹？
 * @author Administrator
 *
 */
public class task2 {
	public static void main(String[] args) {
//		x,y,z分别为公鸡母鸡只数
		int x,y,z;
		//容易知道0<=x<=20,0<=y<33,0<=z<=100
		for (x=0;x<=20;x++){
			for (y=0;y<=33;y++){
				for (z=0;z<=100;z++){
					if (x+y+z==100&&15*x+9*y+z==300){
						System.out.println("公鸡只数为："+x);
						System.out.println("母鸡只数为："+y);
						System.out.println("雏鸡只数为："+z);
					}
				}
			}
		}
	}

}
