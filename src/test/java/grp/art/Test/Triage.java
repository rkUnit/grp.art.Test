package grp.art.Test;

import java.util.Scanner;

public class Triage {

	public static void main(String[] args) {
char ch;
for(int i=0;i<=10;i++)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter any chararcter  " );
ch=scan.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println(ch+ " Character is vowel");	
}
else {
	System.out.println("Character is not vowel");
}
	
	}

}
}
