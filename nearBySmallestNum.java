import java.util.Scanner;

public class nearBySmallestNum{
	public static void main(String[] args){
		//code
		int max;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextInt();
		}
		for(int i=0; i<n; i++){
			max = a[i];
			//max = temp;
			for(int j=i+1;j<n;j++){
				if(max > a[j]){
					System.out.print(a[j]+" ");
					j=n;
				}
				else if(j==n-1){
					System.out.print("-1 ");
				}
			}
		}
		System.out.print("-1");
	}
}