package Strings;

public class InputBased {
    public static void main(String[] args) {
        String input = "th# gre&&tes₹ &ati&n";
        String output = stringTransform(input);
        System.out.println(output);
    }
    public static String stringTransform(String s) {
    
        s = s.replaceAll("[^A-Za-z ]", " ");
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        if (words.length > 0){
            result.append(words[0]);    
        }    
        if (words.length > 1) {
            result.append(" res");      
        }    
        if (words.length > 2) {
            result.append(" I");             
        }
        return result.toString();
    }
}