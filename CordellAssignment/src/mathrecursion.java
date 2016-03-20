import javax.swing.JOptionPane;

public class mathrecursion {

public static int dcountmethod(){
		
		int dcount=0;
		int i=Integer.parseInt(JOptionPane.showInputDialog("i"));
		
		
		while (i>0){
			dcount=dcount+1;
			i=i/2;
			
		
		
			
		}
		
		System.out.println(dcount);
		return dcount;
		
		

	}
	
	
}
