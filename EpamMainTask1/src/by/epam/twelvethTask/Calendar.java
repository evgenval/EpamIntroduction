package by.epam.twelvethTask;

public class Calendar {

	private int day, month, year;
	private static final int FOUR = 4;
	private static final int ONE_HUNDRED = 100;
	private static final int FOUR_HUNDREDS = 400;
	private static final int ZERO = 0;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>0 && day<32) {
			this.day = day;
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 0 && month < 13) {
			this.month = month;
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 0) {
			if(month == 2 && chechingForLeapYear(year) && day>29 || month == 2 && !chechingForLeapYear(year) && day > 28) {
				System.out.println("ERROR!!!");
				System.exit(0);
			}else {
							this.year = year;
			}
		}else {
			System.out.println("ERROR!!!");
			System.exit(0);
		}
	}
	
	public boolean chechingForLeapYear(int year) {
		if((year % FOUR ==ZERO) && (year % ONE_HUNDRED !=ZERO) ||
				(year % FOUR == ZERO && year % ONE_HUNDRED == ZERO && year % FOUR_HUNDREDS == ZERO)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void whatIsTheDateOfTheNextDaY() {
		int nextDay = day;
		int nextMonth = month;
		int nextYear = year;
		
			if(month == 2) {
				if(chechingForLeapYear(year) && day == 29) {
					nextDay = 1;
					nextMonth =3;
				}else if(!chechingForLeapYear(year) && day == 28) {
					nextDay = 1;
					nextMonth =3;
				}else {
					nextDay++;
				}
			}else {
				if((month==4 || month == 6 || month == 9 || month == 11) && day == 30) {
					nextDay = 1;
	                nextMonth++;
				}else if(month == 12 && day == 31){
	                nextDay = 1;
	                nextMonth = 1;
	                nextYear++;
	            }else if (day == 31){
	                nextDay = 1;
	                nextMonth++;
	            }else {
	                nextDay++;
	            }
	        }
	        System.out.println("Next date: " + nextDay + "-" + nextMonth + "-" + nextYear);
					
	}
}
