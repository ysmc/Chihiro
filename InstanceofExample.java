/*
ポリモーフィズム　クラスの確認
作成日　11/11(土)
*/
public class InstanceofExample{
	public static void main(String[] args){
		
		Person t = new Teacher();
		t.work();
		((Teacher)t).makeTest();
		
		Person s = new Student();
		s.work();
		
		
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();
		
		for(int i = 0; i < persons.length; i++){
			if(persons[i] instanceof Person){
				System.out.println("persons[" + i + "]はPersonクラスのインスタンスです。");
			}
			if(persons[i] instanceof Student){
				System.out.println("persons[" + i + "]はStudentクラスのインスタンスです。");
			}
			if(persons[i] instanceof Teacher){
				System.out.println("persons[" + i + "]はTeacherクラスのインスタンスです。");
			}
		}
	}
}
