public class TestOverride {
public void sayHello(String par)	{
System.out.println("hello "+par);	}
	public void sayHello()	{	
	System.out.println("Hello Ghf");	}	
public static void main(String[] args) 
}String s="hello";		
TestOverride t=new TestOverride();		
t.sayHello();		
t.sayHello(s);			
}}