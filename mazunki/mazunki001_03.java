class mazunki001_03 {

	public static void main(String[] args){

		String[] DaysOfTheWeek = {
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
			"Sunday"
		};

		System.out.print("Today is " + DaysOfTheWeek[4] + ". "); //Arrays start with 0, Friday is 5th day. 5-1 = 4
		System.out.println("Tomorrow'll be " + DaysOfTheWeek[5] + ". "); // 5 for Saturday.

	}
}