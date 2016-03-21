


public class StringRecursion {
	
	
	

	
	
	
	public static String wordrecursion(String word){
		
		
		
		
		
		char a;
			 
		
			 
			 
			 int arraylen = word.length();
		char wordarr[] = new char[arraylen];
				
				if (word == null || word.equals("")) //www.stackexchange.com
			    {
			        return word;
			    }
			    else
			    {
			    	a=word.charAt(0);
			        System.out.println(word.charAt(0));
			       wordarr[0]=a;
			       System.out.println(wordarr);
			        return wordrecursion(word.substring(1, word.length()));
			        
			    }
				
				
				 //print out each index of wordarr array
				
			
			
			 
			 
	}
}