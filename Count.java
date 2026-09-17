class Count{
	public static void main(String[] args){
		String text = "Naresuan University";
		System.out.println(countVowels(text));
	}
	public static boolean isVowel(char c){
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			return true;
		else 
			return false;
	}

	public static int countVowels(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(isVowel(s.charAt(i))){
				count++;
			}
		}
		return count;
	}
}
