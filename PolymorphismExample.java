public class PolymorphismExample{
	public static void main(String[] args){
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();
		
		for(int i = 0; i < persons.length; i++){
			persons[i].work();
		}
	}
}
