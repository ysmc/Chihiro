/*
第7章　継承　フィールドとメソッドの継承
作成日　11/10(金)
*/
class IStudentCard extends StudentCardExample{
	String nationality;
	
	void printInfo(){
		System.out.println("学籍番号" + this.id);
		System.out.println("氏名" + this.name);
		System.out.println("国籍" + this.nationality);
	}
}