/*
IStudentCard.javaを呼び出すためのプログラムコード
作成日　11/10(金)
*/
public class OverrideExample{
	public static void main(String[] args){
		StudentCardExample a = new StudentCardExample();
		a.id = 1234;
		a.name = "鈴木次郎";
		a.printInfo();
		
		IStudentCard b = new IStudentCard();
		b.id = 2345;
		b.name = "John Smith";
		b.nationality = "イギリス";
		b.printInfo();
	}
}
