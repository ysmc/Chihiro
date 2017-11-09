/*
ループ内の処理をスキップする「continue」
作成日　11/09(木)
*/
public class ContinueExample{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0){
				continue;
			}
			sum += i;
			System.out.println("変数sumに" + i + "を加えました。sumは" + sum);
		}
	}
}
