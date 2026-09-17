import java.util.Scanner;
class Test1{
	
	public static double pounds2kg(int pounds){
		return pounds/2.2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pounds;
		double kg;
		System.out.print("Enter value in pounds: ");
		pounds = sc.nextInt();
		kg = pounds2kg(pounds);
		System.out.printf("%d pounds = %.2f kg\n",pounds,kg);
		
		System.out.println(pounds+" pounds = "+kg+" kg");

	}
}
