/*
ループ処理のネスト
作成日　11/09(木)
*/
public class NestExample{
	public static void main(String[] args){
		for(int a = 1; a <= 3; a++){
			System.out.println("a = " + a);
			for(int b = 1; b <= 3; b++){
				System.out.println("  b = " + b);
			}
		}
	}
}
