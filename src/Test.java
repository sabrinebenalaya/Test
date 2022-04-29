import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {

    public static void main(String[] args)  throws Exception{
		
		String msg = "haifa";
		int age =30;
		
		System.out.println("hello world");
		
		PrintMessage(msg);
		
		System.out.println("dans 5 jour, je fais mes "+CalcAge(age)+" ans");
		
		System.out.println("==========la classe Test ==================");
			User user = new User();
			user.main(msg);
			System.out.println("Nom : "+ user.getName());
			user.setName(msg);
			System.out.println("Le nouveau nom : "+ user.getName());
		
		
		String fileName = "fichierTest.txt";
		File fichier = new File("C:/Users/USER/dev/java/Test/"+fileName);
		
		System.out.println("========== le contenu du fichier ==================");
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
	private static int CalcAge(int age) {
		return age+1;
	}
	
	private static void PrintMessage(String msg){
		System.out.println("Bonjour "+ msg);
	}

}
