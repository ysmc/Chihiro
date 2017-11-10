/*
メソッドの活用実例
作成日　11/10(金)
*/
class VirtualDog{
	String name;
	int maxEnergy;
	int energy;
	
	VirtualDog(String name, int maxEnergy, int energy){
		this.name = name;
		this.maxEnergy = maxEnergy;
		this.energy = energy;
	}
	
	void sleep(){
		System.out.println(this.name + ":よく寝た。体調が回復したよ。");
		this.energy = this.maxEnergy;
	}
	
	void walk(){
		if(this.energy < 10){
			System.out.println(this.name + ":疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(this.name + ":歩いたよ。体力が10減った。最大体力が1増えた。");
			this.energy -= 10;
			this.maxEnergy++;
		}
	}
	
	void printInfo(){
		System.out.println("[状態出力]");
		System.out.println("名前:" + this.name);
		System.out.println("最大体力:" + this.maxEnergy);
		System.out.println("体力:" + this.energy);
	}
}

public class VirtualPetGame2{
	public static void main(String[] args){
		VirtualDog taro = new VirtualDog("タロ", 100,50);
		VirtualDog jiro = new VirtualDog("ジロ", 80,40);
		
		taro.walk();
		jiro.sleep();
		taro.walk();
		taro.sleep();
		jiro.walk();
		
		taro.printInfo();
		jiro.printInfo();
	}
}
