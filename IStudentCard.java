/*
第7章　継承　フィールドとメソッドの継承
作成日　11/10(金)
*/
public class IStudentCard extends StudentCardExample{
	String nationality;
	
	void printInfo(){
		super.printInfo();
		System.out.println("国籍:" + this.nationality);
	}
}