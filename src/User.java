public class User {
    public String  nom;
	public int  age;
	
	public  void main() {
		System.out.println("bonjour , bienvenue dans la class User");
	}
	
    public User(){
        this.nom = "samar ben alaya";
		this.age = 31;
    }

	public String getNom(){
		return nom;
	}
	public void setNom(String name){
		this.nom = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
