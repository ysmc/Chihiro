/*
IStudentCard.javaを呼び出すためのプログラムコード
作成日　11/10(金)
*/
public class InheritanceExample{
	public static void main(String[] args){
		IStudentCard a = new IStudentCard();
		a.id = 2345;
		a.name = "John Smith";
		a.nationality = "イギリス";
		a.printInfo();
	}
}
