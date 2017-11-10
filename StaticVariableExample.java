/*
クラス変数とクラスメソッド(クラス変数)
作成日　11/10(金)
*/
class StudentCard{
	static int counter = 0;
	int id;
	String name;
	
	StudentCard(int id, String name){
		System.out.println("StudentCardクラスのコンストラクタが呼び出されました。");
		this.id = id;
		this.name = name;
		StudentCard.counter++;
	}
}
public class StaticVariableExample{
	public static void main(String[] args){
		System.out.println("StudentCard.counter=" + StudentCard.counter);
		StudentCard a = new StudentCard(12345,"鈴木太郎");
		System.out.println("StudentCard.counter=" + StudentCard.counter);
		StudentCard b = new StudentCard(12346,"佐藤花子");
		System.out.println("StudentCard.counter=" + StudentCard.counter);
	}
}
