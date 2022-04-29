public class User {
    public String  name;
	
	public  void main(String args) {
		System.out.println("bonjour "+args+", ici c'est la class test");
	}
	
    public User(){
        this.name="sabrine";
    }

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
}
