
public class TrashBubble {
	public static void main(String[] args) {
		int[] N = { 5,9,3,1,2,8,4,7,6};

		for(int i = 0; i < N.length-1; i++)
		for(int j = N.length-1; j > 0; j-- ) {
			if( N[ j - 1 ] > N[ j ]) {
			int A = N[ j ];
			N[ j ] = N[ j - 1 ];
			N[ j - 1 ] = A;
			}
		}

		for(int i = 0; i < N.length; i++) {
			System.out.print(N[i]);
		}
		}

	}
