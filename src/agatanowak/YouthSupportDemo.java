package agatanowak;


public class YouthSupportDemo {

	public static void main(String[] args) {
		
		//set data for jane and other people connected with her
		YoungAdult jane = new YoungAdult("Jane","Private","01-06-1999",'F', 22);
		jane.setPersonality(3,3,3,3,3);
		
		YoungAdult joe = new YoungAdult("Joe","Private","10-10-1999",'M', 22);
		joe.setPersonality(1,1,1,1,1);
		
		YoungAdult peter = new YoungAdult("Peter","Public","08-03-2000",'M', 21);
		peter.setPersonality(5,5,5,5,5);
		
		Adult janeMum = new Adult("Mary","Mother","01-09-1969",'F', 52);
		janeMum.setPersonality(3,3,3,3,3);
		
		Adult janeDad = new Adult("John","Father","15-11-1965",'M', 56);
		janeDad.setPersonality(3,3,3,3,3);
		
		Adult janeTutor = new Adult("Margret","Tutor","12-05-1980",'F', 41);
		janeTutor.setPersonality(3,3,3,3,3);
		
		jane.addTutor(janeTutor);
		jane.addMumAndDad(janeMum,janeDad);
		jane.addFriend(peter);
		jane.addSiblings(joe);
		
		System.out.println(jane.getinfo());
		
		
		//set activities of jane before lockdown
		jane.addActivity(new Activity("basketball", "sports"));
		jane.addActivity(new Activity("house cleaning", "chores"));
		jane.addActivity(new Activity("go to cinema", "entertainment"));
		jane.addActivity(new Activity("homework", "educational"));
		jane.addActivity(new Activity("friend meeting", "socialization"));

		System.out.print("Pre-lockdown: ");
		jane.getFeelings();

		
		//apply lockdown on jane's activities and print her feelings 
		Lockdown ld = new Lockdown();
		jane.activities = ld.apply(jane.getActivities());
		System.out.print("In Lockdown without Youth Support: ");
		jane.getFeelings();		
		
		
		//apply Youth Support service and print jane's feelings
		YouthSupport ys = new YouthSupport();
		jane.activities = ys.apply(jane.getActivities(), jane);
		System.out.print("In Lockdown with Youth Support: ");
		jane.getFeelings();	
		
	}
		

}
