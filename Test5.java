class Test5{
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		System.out.println(sum_array(a,0));
		System.out.println(sum_array(a,1));
		System.out.println(sum_array(a,2));
		System.out.println(sum_array(a,3));
		System.out.println(sum_array(a,4));
		System.out.println(sum_array(a,5));
		System.out.println(sum_array(a,6));
	}
	public static int sum_array(int a[],int n){
		int sum = 0;
		for(int i = 0;i<n ;i++){
			sum=sum+a[i];
		}
		return sum;
	}
}
