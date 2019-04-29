package org.string.upercase.lowescase;

public class Findcount {

	public static void main(String[] args) {
       int lowercase=0,uppercase=0,number=0,specialchar=0;
       String s="gfjgwerwer@@@%%weWWWEEWW@@7654";
      for (int i = 0; i < s.length(); i++) {
    	  char ch=s.charAt(i);
    	  if (Character.isLowerCase(ch)) {
    		  lowercase++;
		}
    	  else if (Character.isUpperCase(ch)) {
    		  uppercase++;
			
		}
    	  else if (Character.isDigit(ch)) {
	          number++;		
		}
    	  else {
    		  specialchar++;
		}  
      }
    	  
    	  System.out.println("lowercase count is: "+lowercase);
    	  System.out.println("uppercase count is: "+uppercase);
    	  System.out.println("number count is: "+number);
    	  System.out.println("specialcharacter count is: "+specialchar);
    	  
		
	}

}
