package grp.art.Test;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="madam";
String d="";
for(int i=s.length()-1;i>=0;i--)
{
d=d+s.charAt(i);	
}

if(d.equals(s))
{
System.out.println("this is a pallindrome: "+d);

}
else {
	System.out.println("this is not a pallindrome: "+d);

}
//for(int i=0;i<s.length();i++)
//{
//D=s.charAt(i)+D;	
//}
//if(D.equalsIgnoreCase(s))
//{
//System.out.println("printing the D is a Pallindrome "+D);
//}
//else {
//System.out.println("printing the D is not a Pallindrome "+D);
//}
//System.out.println("S is: "+s);
	}

}
