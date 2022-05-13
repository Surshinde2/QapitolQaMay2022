package sampleProgram;

public class Reverse_String {
public static void main(String[] args) {
	String s="Welcome to Java Programing Language";
	String rev=" ";
	int lem=s.length();
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	
	
	
	
	
	
	
	
	
	
}
}
