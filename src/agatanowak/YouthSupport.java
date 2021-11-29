package agatanowak;

import java.util.ArrayList;

public class YouthSupport {
	
	ArrayList<String> activities = new ArrayList<String>();
	
	public ArrayList<String> apply(ArrayList<String> current, YoungAdult teenager) {
		//choose which activities are proper to that person
		if (teenager.extraversion>2) {
			activities.add("online meetings"); 
		}
		if (teenager.conscientiousness>2) {
			activities.add("cooking");
		}
		if (teenager.openness>2) {
			activities.add("home workout");
		}
		if (teenager.neuroticism<4) {
			activities.add("watching films"); 
		}
		if (teenager.agreeableness>2) {
			activities.add("reading books");
		}
		
		//add these activities to the list of current activities of that person
		for (int i = 0; i<activities.size(); i++) {
			current.add(activities.get(i));
		}
		return current;
	}
	
}
