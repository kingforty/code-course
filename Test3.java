class Test3{
	public static void main(String[] args){
		int[] javaScores = {90, 60, 50};
		System.out.println(allHavePassed(javaScores));
	}

	public static boolean allHavePassed(int score[]){
		boolean allpassed = true;
		for(int i =0;i<score.length;i++){
			if(score[i]<40){
				allpassed = false;
				break;
			}
		}
		return allpassed;
	}
}
