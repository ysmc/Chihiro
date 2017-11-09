/*
インスタンスへの参照
作成日　11/09(木)
*/
class StudentCard{
	int id;
	String name;
}

public class InstanceExample2{
	public static void main(String[] args){
		StudentCard a = new StudentCard();
		StudentCard b = new StudentCard();
		StudentCard c = b;
		a.id = 1234;
		a.name = "鈴木太郎";
		b.id = 1235;
		b.name = "佐藤花子";
		
		System.out.println("aのidの値は" + a.id + ",nameは" + a.name );
		System.out.println("bのidの値は" + b.id + ",nameは" + b.name );
		System.out.println("cのidの値は" + c.id + ",nameは" + c.name );
		
		System.out.println("==============================================");

		c.id = 1236;
		c.name = "山田次郎";
		
		System.out.println("aのidの値は" + a.id + ",nameは" + a.name );
		System.out.println("bのidの値は" + b.id + ",nameは" + b.name );
		System.out.println("cのidの値は" + c.id + ",nameは" + c.name );
	}
}

		