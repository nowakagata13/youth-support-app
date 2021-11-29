package agatanowak;
import java.util.ArrayList;


public class Lockdown {
	
	static String[] prohibitedActivities = {"go outside", "go to cinema", "basketball", "friend meeting"};
			
	public ArrayList<String> apply(ArrayList<String> obj) {
		// delete the activities which are prohibited in lockdown from the list of current activities
		for (int i = 0; i<obj.size(); i++) {
			for (int j = 0; j<prohibitedActivities.length; j++) {
				if (prohibitedActivities[j]==obj.get(i)) {
					obj.remove(obj.get(i));
				}
			}
		}
		return obj;
	}

}
