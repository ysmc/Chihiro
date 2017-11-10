/*
クラス活用の実例（バーチャルドッグ作成）
作成日　11/10(金)
*/
class VirtualDog{
	String name;
	int maxEnergy;
	int energy;
}

public class VirtualPetGame{
	public static void main(String[] args){
		VirtualDog taro = new VirtualDog();
		taro.name = "タロ";
		taro.maxEnergy = 100;
		taro.energy = 50;
		
		VirtualDog jiro = new VirtualDog();
		jiro.name = "ジロ";
		jiro.maxEnergy = 80;
		jiro.energy = 40;
		
		System.out.println("名前：" + taro.name);
		System.out.println("最大体力：" + taro.maxEnergy);
		System.out.println("体力：" + taro.energy);
		
		System.out.println("名前：" + jiro.name);
		System.out.println("最大体力：" + jiro.maxEnergy);
		System.out.println("体力：" + jiro.energy);
	}
}
