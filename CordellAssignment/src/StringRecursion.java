import javax.swing.JOptionPane;


public class StringRecursion {
	
	
	

private static String word;
	
	
	
	public static String wordrecursion(){
		
		
		
		
		
		
			 word=JOptionPane.showInputDialog("Enter a word"); //enter in a word
			 
			 String wordarr[] = word.split("(?!^)"); // www.stackexchange.com splits word into different characters and puts each character into a separate array index where the array name is wordarr
			 
			for (int i = 0; i < wordarr.length; ++i){ //run for the length of the wordarr array
				
				
				
				System.out.println(wordarr[i]); //print out each index of wordarr array
				
			}
			
			return word;
	}
}
