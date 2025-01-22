package easy;

import java.sql.SQLOutput;

public class SentenceFormation {
    public static void main(String[] args) {
        String str ="IndIa IS mY cOuNtRy";
        String[] strArray =str.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for(String s: strArray){
          result.append(Character.toUpperCase(s.charAt(0)))
                  .append(s.substring(1).toLowerCase())
                  .append(" ");

        }
        System.out.println(result);

    }
}
