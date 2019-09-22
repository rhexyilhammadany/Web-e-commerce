import java.util.Scanner;
public class Tugas2_173040138 {
  public static void main (String [] args) {
  String user, pass;
  Scanner sc = new Scanner (System.in);
 
   System.out.print("Username : ");
   user = sc.next();
   System.out.print("Password : ");
   pass = sc.next();
    
   if( user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("abcd1234")){
   	   System.out.println("Selamat datang Admin");
   }else{
  	     System.out.println("Maaf anda tidak di kenali");
  }
  }
}