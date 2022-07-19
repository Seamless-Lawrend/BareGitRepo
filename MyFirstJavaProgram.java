//import java.lang.System.out;	ne moze ovako
//in code::out.println("Foo");

public class MyFirstJavaProgram {

	public static void main(String []args){

		String hello="Hello";
		String world="world";
		String helloWorld= hello + " " + world+'.';

	System.out.println("Hello World.");
	System.out.println(helloWorld);
	StringBuilder sb = new StringBuilder();
	sb.append("Hello").append(" ").append("world.");
	String helloagain = sb.toString();
	System.out.println(sb);System.out.println(helloagain);
	
	
	String s1=hello;
	String s2=world;
	System.out.println ( concat (s1,s2));
	}
	public static String concat (String s1, String s2){
		return (s1 + " " + s2 +".");
		}
	
	
}