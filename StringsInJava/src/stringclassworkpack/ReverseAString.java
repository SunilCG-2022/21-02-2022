package stringclassworkpack;

class ReverseAString{
   public static void main (String[] args) {
      
       String str= "Hello", reverse="";
       char ch;
      
     for (int i=0; i<str.length(); i++)
     {
       ch= str.charAt(i); 
       reverse= ch+reverse;
     }
     System.out.println("Reversed word: "+ reverse);
   }
}

