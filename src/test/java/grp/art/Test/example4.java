package grp.art.Test;

public class example4 {
public static int recsum(int n)
{
	if(n<=1)
	
		return 1;
	
		
		return n+recsum(n-1);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
        System.out.println(recsum(n)); 
	}

}
