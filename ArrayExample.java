/*
配列-1次元配列
作成日　11/09(木)
*/
public class ArrayExample{
	public static void main(String[] args){
		int[] scores;
		scores = new int[5];
		scores[0] = 50;
		scores[1] = 55;
		scores[2] = 70;
		scores[3] = 65;
		scores[4] = 80;
		
		for(int i = 0; i < 5; i++){
			System.out.println(scores[i]);
		}
	}
}
