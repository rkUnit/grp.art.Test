package grp.art.Test;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c b1=new c();
b1.flag();
b1.disp();
s s1=new s();
	s1.disp();
	}

}
class s
{
int i=8;
void disp()
{
System.out.println("disp is s");	
}
}

class b extends s
{
	int i=7;
	void add()
	{
		System.out.println("add is b");
	}
	
}
class c extends s
{
void flag()
{
System.out.println("flag is c");	
}
}