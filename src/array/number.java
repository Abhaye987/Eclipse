package array;

public class number {
public static void main(String args[]) {
int arr[][]=new int[3][2];
arr[0][0]=2;
arr[0][1]=4;
arr[1][0]=5;
arr[1][1]=6;
arr[2][0]=8;
arr[2][1]=9;

System.out.println(arr[2][0]);
}
int num[][]= {{2,3},{3,4},{4,3}};
for(int i=0;i<3;i++) {
	for(int j=0;j<2;j++) {
		System.out.print(num[i][j]+" ");
	}
	System.out.println();
}
}
}
