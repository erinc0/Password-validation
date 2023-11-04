
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
    String meow = args[0];
    if(meow.length()>=8 && meow.length()<=16){
   HashMap<Character, Boolean> meowMap = new HashMap<>();
    for(char m : meow.toCharArray()){
    if(Character.isUpperCase(m)){
        meowMap.put('a', true);
    }
    else if(Character.isLowerCase(m)){
        meowMap.put('b', true);
    }
    else if(Character.isDigit(m)){
        meowMap.put('c', true);
    }
    else if ("~!@#$%^&*()-".contains(String.valueOf(m))){
        meowMap.put('d', true);
    }
    }   
 int meowcount = 0;
 for(boolean woof : meowMap.values()){
    if(woof){
        meowcount++;
    }
 }
 if(meowcount>=3){
   System.out.println("Valid password");
 }
 else{ System.out.println("Invalid password");}

}else{
        System.out.println("Please enter a valid password length");
    }
}

}