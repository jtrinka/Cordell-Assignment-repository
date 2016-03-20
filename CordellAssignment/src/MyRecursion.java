import javax.swing.JOptionPane;

public class MyRecursion {
	
	
	
	
public static void usernameMethod(){
		
		String name = null;
		
		// www.stackexchange.com
		
					name=JOptionPane.showInputDialog("Enter your username");
			String namesplit[]=name.split("(?!^)");
			
		   
		        
		    	for (int i = 0; i < namesplit.length; ++i){
		    		
		    	if (namesplit[i].equals(" ")){ //www.stackexchange.com
		    		
		    		MyRecursion.usernameMethod();
		    		
		    	
		    	
		    	
		    	}
		    		
		    	
		    			
		    		    
		    	
		    	
		    	
		    		}
		    	for (int j = 0; j < namesplit.length; ++j){
		    	
		    		System.out.print(namesplit[j]);
		        
		    	}
		 
			
		    
	
}

}
