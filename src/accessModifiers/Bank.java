package accessModifiers;

public  class Bank {
	public String branchName;
	
	protected String name;
	String city;
	private String password="Nagrajghale@252774";
	
	public String getPassword() {
		 return this.password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	
	void account() {
		System.out.println("print account");
	}
	public static void main(String[] args) {
		
	
	}
	

}
