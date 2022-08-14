package string;

public class methodsInString {
	
	public static void main(String[] args) {
		
	// 1. equals(String s)
		
		String s = "dipraj";
		String s1 = "dipraj";
		
		boolean s2 = s1.equals(s);
		System.out.println(s2);
		
    // 2. length()
		
	    String s3 = "shahada";
	    int s4 = s3.length();
	    System.out.println(s4);
	    
	// 3. charAt(int index)
	    
	    String s5 = "toranmal";
	    char s6 = s5.charAt(5);
	    System.out.println(s6);
	    
	// 4. toLowerCase()
	    
	    String s7 = "MahaRashtra";
	    String s8 = s7.toLowerCase();
	    System.out.println(s8);
	    
	// 5. toUpperCase()
	    
	    String s9 = "Rajasthan";
	    String s10 = s9.toUpperCase();
	    System.out.println(s10);
	    
	// 6. equalsIgnoreCase(String s)
	    
	    String s11 = "karnataka";
	    String s12 = "KARNATAKA";
	    boolean s13 = s12.equalsIgnoreCase(s11);
	    System.out.println(s13);
	    
	// 7. substring(int beginindex)
	    
	    String s14 = "MadyaPradesh";
	    String s15 = s14.substring(5);
	    System.out.println(s15);
	   
	    
	    
	// 8. substring(int beginindex,int endindex)
	    
	    String s16 = "Brahamavallyproject";
	    String s17 = s16.substring(7,12);
	    System.out.println(s17);
	    
	// 9. replace(String seq1 ,String seq2)
	    
	    String s18 = "HimachalPradesh";
	    String s19 = s18.replace("Himachal","Uttar");
	    System.out.println(s19);
	    
	// 10. replace(char old,char new)
	    
	    String s20 = "nandurbar";
	    String s21 = s20.replace('n','N');
	    System.out.println(s21);
	    
	// 11. trim()
	    
	    String s22 = "  we are playing cricket   ";
	    String s23 = s22.trim();
	    System.out.println(s23);
	    
	// 12. indexof(char ch)
	    
	   String s24 = "maharashtra";
	   int s25 = s24.indexOf('a');
	   System.out.println(s25);
	   
	// 13. lastIndexOf(char ch)
	   
	   int s26 = s24.lastIndexOf('a');
	   System.out.println(s26);
	   
	// 14. contains(String s)
	   
	   String s27 = "primeminister";
	   boolean s28 = s27.contains("mini");
	   boolean s29 = s27.contains("mint");
	   System.out.println(s28);
	   System.out.println(s29);
	   
	// 15. startsWith(String prefix)
	   
	   String s30 = "prakasha";
	   boolean s31 = s30.startsWith("pra");
	   boolean s32 = s30.startsWith("sha");
	   System.out.println(s31);
	   System.out.println(s32);
	   
	// 16. endsWith(String suffix)
	   
	   boolean s33 = s30.endsWith("sha");
	   boolean s34 = s30.endsWith("pra");
	   System.out.println(s33); 
	   System.out.println(s34);
	  
	// 17. split(String s)
	   
	   String s35 = "i am a good tester";
	   String [] s36 = s35.split(" ");
	   for(String s37:s36)
	   {
	   System.out.println(s37);
	   }
	   
	// 18. toCharArray()
	   
	   String s39 = "Amrutvahini";
	   char [] s40 = s39.toCharArray();
	   for(char s41:s40)
	   {
	  	   System.out.println(s41);
	   } 
	   
	}
}
