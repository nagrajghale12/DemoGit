package classAndObject;

public class Pen {
	String colour;
	String type;
	double cost;
	
	public void printInfo() {
		System.out.println(this.colour);
		System.out.println(this.type);
		System.out.println(this.cost+" Rs.");
		}
	Pen(){
		
	}
	
	Pen (Pen p1){                  //copy constructor
		this.colour=p1.colour;
		this.type=p1.type;
		this.cost=p1.cost;
	}
	
	Pen(String c, String t, double cost){
		this.colour=c;
		this.type=t;
		this.cost=cost;
	}

	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.colour="blue";
		p1.type="ballpoint";
		p1.cost=125;
		
		Pen p2 = new Pen();
		p2.colour="Black";
		p2.type="Gel";
		p2.cost=150.75;
		
		Pen p3=new Pen("green","gel",100.25);
		
		Pen p4=new Pen(p1);      //copy constructor
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo(); 
		p4.printInfo();
	}
}
