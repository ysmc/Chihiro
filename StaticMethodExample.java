/*
SimpleCalcクラス(SimpleCalc.java)で宣言したgetriangleAreaクラスメソッドを
呼び出すためのプログラムコード
作成日　11/10(金)
*/
public class StaticMethodExample{
		public static void main(String[]args){
			System.out.println("底辺が10、高さが5の三角形の面積は" + SimpleCalc.getTriangleArea(10.0,5.0) + "です。");
		}
}