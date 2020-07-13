// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch
{
	public static void main (String[] args)
	{
		Stack<Character> s = new Stack<Character>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nParenthesis Matching");
		System.out.print ("Enter a parenthesized expression: ");
		line = scan.nextLine();
		
		// loop to process the line one character at a time
		
		for(int i=0; i<line.length(); i++)
		{
			char ch = line.charAt(i);
			if(ch=='(')
				s.push('(');
			else if(ch==')')
			{
				if(s.size()>0)
					s.pop();
				else
					System.out.println("Error: Too many closing parenthesis.");
					return;
			}
		}
		
		// print the results
		
		if(s.size() == 0)
			System.out.println("All parenthesis match.");
		else
			System.out.println("Error: Too many opening parenthesis.");
	}
}
