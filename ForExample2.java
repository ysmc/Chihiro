/*
forループ内で変数を使う
作成日　11/09(木)
*/
public class ForExample2{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			sum += i;
			System.out.println(i + "を加えました");
		}
		System.out.println("合計は" + sum + "です");
	}
}
