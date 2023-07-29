package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  public boolean isPalindrome(String s){

      char[] ch=s.toCharArray();
      for(int i=0;i<ch.length; i++){
          if(ch[i]!=ch[ch.length-1-i])
              return false;
      }
      return  true;
  }
}