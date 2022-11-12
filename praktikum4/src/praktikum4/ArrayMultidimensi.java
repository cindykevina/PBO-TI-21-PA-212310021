package praktikum4;

public class ArrayMultidimensi {
	//int [row] [column] {

	// [1,2,3,4]
	// [5,6,7,8]
	// [9,10,11,12] }

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int b [][] = new int [2][2];

	b[0][0] = 8;
	b[0][1] = 7;

	b[1][0] = 3;
	b[1][1] = 2;

	System.out.println(b[0][0]);
	System.out.println(b[0][1]);
	System.out.println(b[1][0]);
	System.out.println(b[1][1]);

	System.out.println("=with loop=");
	for (int i = 0; i < 2; i++) {
	for (int j = 0; j < 2; j++) {
	System.out.println(b[i][j]);
	}
	}
	}

	}

	//int a[][] = {
	// {1, 2, 3, 4},
	// {8, 9, 10, 11},
	//};

	//for (int i = 0; i < 2; i++) {
	// for (int j = 0; j < 4; j++) {
	// System.out.println(a[i][j]);
	//}
	//}