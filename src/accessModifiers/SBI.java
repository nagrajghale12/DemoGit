package accessModifiers;

public class SBI  {

	
	
	
	public static void main(String[] args) {
		Bank p=new Bank() ;
		System.out.println(p.getPassword());
		p.setPassword("1234");
		System.out.println(p.getPassword());
		
		p.city="Bangalore";
		p.name="nagraj";
		
		
        
	}
}
