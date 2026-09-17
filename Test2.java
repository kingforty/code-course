import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = (i+1)*2;
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
