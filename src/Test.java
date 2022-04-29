import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

    public static void main(String[] args)  throws Exception{
		
		String msg = "Sabrine ben alaya";
		int age =30;
		
		System.out.println("hello world");
		
		PrintMessage(msg, age);
		
		System.out.println("==========la classe User ==================");
			User user = new User();
			
			System.out.println("Nom : "+ user.getNom());
			System.out.println("Age : "+ user.getAge());

			user.setAge(age+1);	
			System.out.println("Dans 7 mois, tu fête tes "+ user.getAge()+" ans");
			
			user.setNom(msg);
			System.out.println("et ton nom sera "+ user.getNom());
		
		
		String fileName = "fichierTest.txt";
		File fichier = new File("C:/Users/USER/dev/java/Test/"+fileName);
		
		System.out.println("==========  fichier : fichierTest.txt ==================");
		System.out.println("Le contenu initial du fichier '"+fileName+"':");
		readfile(fichier, fileName);
		System.out.println("Le nouveau contenu du fichier "+fileName+ ":");
		writefile(fichier,msg, fileName);
		readfile(fichier,fileName);				
	}

	private static void writefile(File fichier, String msg, String fileName) {
		
		try{
			BufferedWriter bfwrite = new BufferedWriter(new FileWriter(fichier,true));
			bfwrite.write("\r\n"+msg);
			bfwrite.close();
		}catch (Exception e) {
			System.out.println("Le fichier '"+fileName+"' est introuvable");
		}		
	}

	private static void readfile(File fichier, String fileName) {
		
		try{
			BufferedReader bfread = new BufferedReader(new FileReader(fichier));
			String ligne;
			while ((ligne = bfread.readLine()) != null)
			    {System.out.println(ligne);}
			bfread.close();
		}catch (Exception e) {
			System.out.println("Le fichier '"+fileName+"' est introuvable");
		}
		
	}
		
	private static void PrintMessage(String msg, int age){
		System.out.println("Bonjour, je m'appelle "+ msg+" et j'ai "+age+" ans.");
	}

}
