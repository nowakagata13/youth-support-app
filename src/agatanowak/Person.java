package agatanowak;

public class Person {

	public String firstname;
	private String lastname;
	protected String birthdate;
	protected char gender;
	public int age;
	private long phone;
	int conscientiousness = 0;
	int agreeableness = 0;
	int neuroticism = 0;
	int openness = 0;
	int extraversion = 0;
	

	public Person(String fn, String ln, String bd, char g, int a) {
		firstname = fn;
		lastname = ln;
		birthdate = bd;
		gender = g;
		age = a;
	}
	
	public void setPersonality(int c, int a, int n, int o, int e) {
		conscientiousness = c;
		agreeableness = a;
		neuroticism = n;
		openness = o;
		extraversion = e;
	}
	
	
	public String getinfo() {
		return firstname + " " + lastname +", " + age;
	}

	private String getBirthdate() {
		return birthdate;
	}

	private void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	private char getGender() {
		return gender;
	}

	private void setGender(char gender) {
		this.gender = gender;
	}

	private long getPhone() {
		return phone;
	}

	private void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
