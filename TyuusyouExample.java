/*
第8章　抽象クラス
実体のない抽象メソッド
作成日　11/14((水)
*/

abstract class Shape {
	abstract void draw();
}

class Polyline extends Shape {
	//折れ線を描画する
	void draw() {
		System.out.println("Ｎ");
	}
}

class Rectangle extends Shape {
	//長方形を描画する
	void draw() {
		System.out.println("□");
	}
}

class Circle extends Shape {
	//円を描画する
	void draw() {
		System.out.println("○");
	}
}

public class TyuusyouExample {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Polyline();
		shapes[1] = new Rectangle();
		shapes[2] = new Circle();
		
		for(int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
	}
}
