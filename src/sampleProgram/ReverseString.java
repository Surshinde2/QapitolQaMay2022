package sampleProgram;

public class ReverseString {
public static void main(String[] args) {
	String s="Suraj";
	int length = s.length();
	String rev =" "; 
	for(int i=s.length(); i>=0; i--) 
	{
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}	
}
