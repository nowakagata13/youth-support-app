package agatanowak;

public class Activity {
	
	String name;
	String type;
	String participants;
	String startDate;
	String endDate;

	public Activity(String na, String ty) {
		name = na;
		type = ty;
	}

	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
