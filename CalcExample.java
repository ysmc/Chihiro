/*
・算術演算子と式
・変数を含む算術演算
作成日　11/08(水)
*/
public class CalcExample{
	public static void main(String[] args){
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/5);
		System.out.println(5%3);
/*
上記は加算、減算、乗算、除算、剰余
下記は変数を含む算術演算
*/
		int i = 10;
		int j = i * 2;
		System.out.println("jの値は" + j);
	}
}
