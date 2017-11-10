/*
第6章　コンストラクタ
作成日　11/10(金)
*/
class StudentCard{
	int id;
	String name;
	
	StudentCard(int id, String name){
		System.out.println("StudentCard クラスのコンストラクタが呼び出されました。");
		this.id = id;
		this.name = name;
	}
}

public class ConstructorExample{
	public static void main(String[] ards){
		StudentCard a = new StudentCard(1234,"鈴木太郎");
		
		System.out.println("aのidの値は" + a.id);
		System.out.println("aのidの値は" + a.name);
	}
}
