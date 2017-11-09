/*
メソッドを呼び出す処理の流れ
作成日　11/09(木)
*/
public class CallMethodExample2{
	public static void methodA(){
		System.out.println("methodAの内部の命令文です。");
	}
	
	public static void main(String[] args){
		System.out.println("これからmethodAを呼び出します。");
		methodA();
		System.out.println("methodAの呼び出しが終わりました。");
	}
}
