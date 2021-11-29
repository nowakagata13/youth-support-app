package agatanowak;
import java.util.ArrayList;

public class YoungAdult extends Person{
	
	public YoungAdult(String fn, String ln, String bd, char g, int a) {
		super(fn, ln, bd, g, a);
	}

	ArrayList<String> activities = new ArrayList<String>();
	
	public ArrayList<String> getActivities() {
		return activities;
	}
	
	public void addActivity(Activity activity) {
		activities.add(activity.name);
	}
	
	public void getFeelings() {
		ArrayList<String> feelings = new ArrayList<String>();
		
		//establish what feelings are felt by this teenager based on their activities and personality
		if ((extraversion>2 || agreeableness>2) && activities.contains("online meetings")) {
			feelings.add("happy");
		}
		if (neuroticism<2 || activities.contains("online school")) {
			feelings.add("sad");
		}
		if (activities.contains("go to cinema") || activities.contains("watching films")) {
			feelings.add("excited");
		}
		if (activities.contains("online meetings")==false && activities.contains("friend meeting")==false) {
			feelings.add("lonely");
		}
		if (activities.contains("basketball")==false && activities.contains("home workout")==false) {
			feelings.add("bored");
		}
		if (activities.contains("friend meeting")) {
			feelings.add("fascinated");
		}
		if (activities.contains("reading books")) {
			feelings.add("hopefull");
		}
		
		//print the feelings
		for (int i = 0; i<feelings.size(); i++) {
			System.out.print(feelings.get(i) + " ");
		}
		System.out.println(" ");
	}
	
	
	public void addTutor(Person t) {
		Person tutor = t;
	}
	
	public void addMumAndDad(Person m, Person d) {
		Person mum = m;
		Person dad = d;
	}
	
	public void addSiblings(YoungAdult s) {
		YoungAdult sibling = s;
	}
	
	public void addFriend(YoungAdult f) {
		YoungAdult friend = f;
	}
	
	
}
