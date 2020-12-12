class Clock {
	String time;

	void setTime(String t) {
		time = t;
	}

	String getTime() { //void getTime() ?? no return!
		return time;
	}
}

class ClockTestDrive {
	public static void main(String[] args) {
		Clock c = new Clock();

		c.setTime("12:34:56");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}