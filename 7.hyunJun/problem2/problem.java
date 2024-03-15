package test5;

import java.util.*;
public class problem {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("====입 출력 예시===");
      System.out.print("입력 => ");
      String str1 = sc.next().toLowerCase();
      String str2 = "";
      
      for(int i=str1.length()-1;i>=0;i--) {
         str2=str2+str1.charAt(i);
      }
      if(str1.equals(str2)) {
         System.out.println(1);
      }else {
         System.out.println(0);
      }
      
   }
}
