/*
ループ処理のネスト（九九一覧表）
作成日　11/09(木)
*/
public class NestExample2{
	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				int value = i * j;
				System.out.println(i + "×" + j + "=" + value);
				System.out.println("  ");
			}
			System.out.println("");
		}
	}
}
