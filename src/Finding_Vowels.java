public class Finding_Vowels {
    public static void main(String args[]){
      String str="Kevin Mitnick";
      int words =str.length();
      for(int i=0;i<words;i++){
          if( str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
              System.out.println("Vowels");
          }

      }
    }

}
