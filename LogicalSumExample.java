/*
論理演算子
作成日　11/09(木)
*/
public class LogicalSumExample{
	public static void main(String[] args){
		int age;
		age = 20;
		if(age < 13 || age >= 65){
			System.out.println("入場料は無料です。");
		} else {
			System.out.println("料金が必要です。");
		}
	}
}
