import javax.swing.JOptionPane;


public class StringRecursion {
	
	
	

private static String word;
	
	
	
	public static String wordrecursion(){
		
		
		
		
		
		
			 word=JOptionPane.showInputDialog("Enter a word");
			 
			 String wordarr[] = word.split("(?!^)"); // www.stackexchange.com
			 
			for (int i = 0; i < wordarr.length; ++i){
				
				
				
				System.out.println(wordarr[i]);
				
			}
			
			return word;
	}
}
