package classAndObject;

public class Student {
	String name;
	int  age;
	float score;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age );
		System.out.println(score);
	}
	
	Student (String name,int age,float score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	public static void main(String[] args) {
		Student s1= new Student("Nagaraj",25,85.50f);
		Student s2= new Student("Resh",25,90.54f);
		s1.printInfo();
		s2.printInfo();
				
	}

}
