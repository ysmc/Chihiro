/*
メソッドの戻り値(double型)
作成日　11/09(木)
*/
public class ReturnExample{
	public static double getAreaOfCircle(double ragius){
		return ragius * ragius * 3.14;
	}
	
	public static void main(String[] args){
		double circleArea = getAreaOfCircle(2.5);
		System.out.println("半径2.5の円の面積は" + circleArea);
	}
}
