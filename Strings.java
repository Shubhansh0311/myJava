import java.util.Scanner;
public class Strings {public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String myString=sc.nextLine();
    
System.out.println(myString);
StringBuilder sb=new StringBuilder(myString);
//replacing a character
  sb.setCharAt(0, 'S');
  System.out.println("string after setting character ");
  System.out.println(sb);
//adding a new character
System.out.println("string after insertion");
System.out.println(sb.insert(0,'s'));
//deleting a character
sb.delete(0, 1);
System.out.println("string after deletion");
System.out.println(sb);
//adding character at last
sb.append('h');
sb.append('u');
sb.append('b');
sb.append('h');
System.out.println("string after insertion at last");
System.out.println("my string is \t"+sb);



}}
  /*strings comparision
        public static void main(String[] args) {
            String firstname = "shubhansh";
            String lastname = "shubhansh";
            if (firstname.compareTo(lastname) == 0) {
                System.out.println("strings are equal");}
                 else if (firstname.compareTo(lastname) < 0) {
                    System.out.println("string two is greater");
                }
                else{
                    System.out.println("unequal strings");}
            }
        }*/   

