/*
第4章　メソッド
作成日　11/09(木)
*/
public class CallMethodExample{
	public static void countdown(){
		System.out.println("カウントダウンをします。");
		for(int i = 5; i >= 0; i--){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		countdown();
	}
}
