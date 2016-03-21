import javax.swing.JOptionPane;

public class mathrecursion {

	int dcount=0;
	int i=0;
	
public static void dcountmethod(int i, int dcount){
		
		
		
		
		if (i>0){
			dcount=dcount+1;
			i=i/2;
			
			mathrecursion.dcountmethod(i, dcount);
		
			
		}
		else{
			
		System.out.println("The number of times it takes to divide your number by 2 to reach a number less than 1 is " +dcount+" times.");
		
		
		}

	}
	
	
}
